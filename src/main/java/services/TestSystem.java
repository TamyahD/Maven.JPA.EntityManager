package services;

import entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

public class TestSystem implements OperationsCRUD<Employee> {
    public static final EntityManagerFactory ENTITY_MANAGER_FACTORY =

    @Override
    public List<Employee> entityList() {
        return null;
    }

    @Override
    public Employee findAll() {
        EntityManager entityManager =
        return null;
    }

    @Override
    public Employee findOne(String id) {
        return null;
    }

    @Override
    public String add(Employee entityType) {
        return null;
    }

    @Override
    public String delete(String id) {
        return null;
    }
}


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
