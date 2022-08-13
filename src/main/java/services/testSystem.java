package services;

import entities.EmployeeEntity;

import javax.persistence.*;
import java.util.List;

public class testSystem {
    private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("jpaentity");

    public static void main(String[] args) {
//        addCustomer("33do", "Myah", "Downes", "2021-1-1");
        getCustomers();
        ENTITY_MANAGER_FACTORY.close();
    }
//
//    public static void addCustomer(String id, String fName, String lName, String hireDate) {
//        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//        EntityTransaction et = null;
//        try {
//            et = em.getTransaction();
//            et.begin();
//            Employee emp = new Employee();
//            emp.setId(id);
//            emp.setfName(fName);
//            emp.setlName(lName);
//            emp.setHireDate(hireDate);
//            em.persist(emp);
//            et.commit();
//        } catch (Exception e) {
//            if (et != null) {
//                et.rollback();
//            }
//            throw new RuntimeException(e);
//        } finally {
//            em.close();
//        }
//    }
//
//    public static void getCustomer(String id) {
//        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//        String query = "SELECT e FROM Employee e WHERE e.id = :emp_Id";
//
//        TypedQuery<Employee> tq = em.createQuery(query, Employee.class);
//        tq.setParameter("emp_Id", id);
//        Employee emp = null;
//        try {
//            emp = tq.getSingleResult();
//            System.out.println(emp.getfName() + " " + emp.getlName());
//        }
//        catch (NoResultException ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            em.close();
//        }
//    }
//
    public static void getCustomers() {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        String strQuery = "SELECT e FROM EmployeeEntity e WHERE e.id IS NOT NULL";
        TypedQuery<EmployeeEntity> tq = em.createQuery(strQuery, EmployeeEntity.class);
        List<EmployeeEntity> employees;
        try {
            employees = tq.getResultList();
            employees.forEach(emp -> System.out.println(emp
                    .getEmpId() + " -> " +emp.getFirstName() + " " +emp.getLastName()));
        }
        catch (NoResultException ex) {
            ex.printStackTrace();
        }
        finally {
            em.close();
        }
    }

}
