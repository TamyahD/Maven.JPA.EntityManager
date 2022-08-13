//package entities;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name="Employee")
//public class Employee implements Serializable {
//    private static final long serialVersionID=1L;
//
//    @Id
//    @Column(name="emp_Id", unique = true)
//    private String id;
//
//    @Column(name="first_Name", nullable = false)
//    private String fName;
//    @Column(name="last_Name", nullable = false)
//    private String lName;
//    @Column(name="hire_Date", nullable = false)
//    private String hireDate;
//
//    public Employee() {
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getfName() {
//        return fName;
//    }
//
//    public void setfName(String fName) {
//        this.fName = fName;
//    }
//
//    public String getlName() {
//        return lName;
//    }
//
//    public void setlName(String lName) {
//        this.lName = lName;
//    }
//
//    public String getHireDate() {
//        return hireDate;
//    }
//
//    public void setHireDate(String hireDate) {
//        this.hireDate = hireDate;
//    }
//}
