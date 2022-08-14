package entities;

import java.sql.Date;

public interface EntityInterface {
    public String getEmpId();

    public void setEmpId(String empId);

    public String getFirstName();

    public void setFirstName(String firstName);

    public String getLastName();

    public void setLastName(String lastName);

    public Date getHireDate();


    public void setHireDate(Date hireDate);
}
