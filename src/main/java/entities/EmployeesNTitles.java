package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class EmployeesNTitles {
    @Basic
    @Column(name = "emp_Id")
    private String empId;
    @Basic
    @Column(name = "first_Name")
    private String firstName;
    @Basic
    @Column(name = "last_Name")
    private String lastName;
    @Basic
    @Column(name = "title")
    private String title;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesNTitles that = (EmployeesNTitles) o;
        return Objects.equals(empId, that.empId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, firstName, lastName, title);
    }
}
