package entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class EmployeeTitleEntityPK implements Serializable {
    @Column(name = "emp_Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String empId;
    @Column(name = "title")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    @Column(name = "start_Date")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date startDate;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTitleEntityPK that = (EmployeeTitleEntityPK) o;
        return Objects.equals(empId, that.empId) && Objects.equals(title, that.title) && Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, title, startDate);
    }
}
