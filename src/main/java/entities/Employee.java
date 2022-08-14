package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Employee {
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
    @OneToMany(mappedBy = "employeeByEmpId")
    private Collection<EmployeeTitle> employeeTitlesByEmpId;

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
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(hireDate, employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, lastName, hireDate);
    }

    public Collection<EmployeeTitle> getEmployeeTitlesByEmpId() {
        return employeeTitlesByEmpId;
    }

    public void setEmployeeTitlesByEmpId(Collection<EmployeeTitle> employeeTitlesByEmpId) {
        this.employeeTitlesByEmpId = employeeTitlesByEmpId;
    }
}
