package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(EmployeeTitlePK.class)
public class EmployeeTitle {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "emp_Id")
    private String empId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "title")
    private String title;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "start_Date")
    private Date startDate;
    @Basic
    @Column(name = "end_Date")
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "emp_Id", referencedColumnName = "emp_Id", nullable = false)
    private Employee<T> employeeByEmpId;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTitle that = (EmployeeTitle) o;
        return Objects.equals(empId, that.empId) && Objects.equals(title, that.title) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, title, startDate, endDate);
    }

    public Employee<T> getEmployeeByEmpId() {
        return employeeByEmpId;
    }

    public void setEmployeeByEmpId(Employee<T> employeeByEmpId) {
        this.employeeByEmpId = employeeByEmpId;
    }
}
