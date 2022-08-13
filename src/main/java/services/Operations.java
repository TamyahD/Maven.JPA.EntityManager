package services;

import entities.Employee;

import javax.persistence.*;
import java.sql.Date;

public class Operations {
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("jpaentity");

//    EntityManager entMan = ENTITY_MANAGER_FACTORY.createEntityManager();
    public static void main(String[] args) {


        ENTITY_MANAGER_FACTORY.close();
    }

    public void createEmployee(String empId, String fName,
                                   String lName, Date hireDate) {
        EntityManager entMan = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entTransaction=null;

        try {
            entTransaction=entMan.getTransaction();
            entTransaction.begin();
            Employee newEmployee = new Employee();
            newEmployee.setEmpId(empId);
            newEmployee.setFirstName(fName);
            newEmployee.setLastName(lName);
            newEmployee.setHireDate(hireDate);
            entMan.persist(newEmployee);
        }
        catch (Exception ex) {
            if (entTransaction!=null) {
                entTransaction.rollback();
            }
            ex.printStackTrace();
        }
        finally {
            entMan.close();
        }
    }

    public void findAll() {
        EntityManager entMan = ENTITY_MANAGER_FACTORY.createEntityManager();
        String query = "SELECT e FROM Employee e WHERE e.id IS NOT NULL";

        TypedQuery<Employee> typedQuery = entMan.createQuery(query, Employee.class);
        typedQuery.setParameter(typedQuery, );
    }
}
