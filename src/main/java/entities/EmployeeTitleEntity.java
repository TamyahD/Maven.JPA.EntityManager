package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "EmployeeTitle", schema = "nuuCompany", catalog = "")
@IdClass(EmployeeTitleEntityPK.class)
public class EmployeeTitleEntity {
    @ManyToOne
    private EmployeeEntity employee;

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
        EmployeeTitleEntity that = (EmployeeTitleEntity) o;
        return Objects.equals(empId, that.empId) && Objects.equals(title, that.title) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, title, startDate, endDate);
    }

//    @ManyToOne
//    @JoinColumn(name = "emp_Id", referencedColumnName = "emp_Id")
//    public EmployeeEntity getEmployeesByTitle() {
//        return getEmployeesByTitle();
//    }
}
