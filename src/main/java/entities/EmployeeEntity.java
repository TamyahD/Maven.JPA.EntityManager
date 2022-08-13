package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Employee", schema = "nuuCompany", catalog = "")
public class EmployeeEntity {
    @OneToMany
    private Collection<EmployeeTitleEntity> empTitles;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "emp_Id")
    private String empId;
    @Basic
    @Column(name = "first_Name")
    private String firstName;
    @Basic
    @Column(name = "last_Name")
    private String lastName;
    @Basic
    @Column(name = "hire_Date")
    private Date hireDate;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return Objects.equals(empId, that.empId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(hireDate, that.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, lastName, hireDate);
    }


    public Collection<EmployeeTitleEntity> getEmployeeTitles() {
        return empTitles;
    }

    public void setEmpTitles(Collection<EmployeeTitleEntity> getTitlesById) {
        this.empTitles = getTitlesById;
    }
}
