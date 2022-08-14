package services;

import entities.Employee;
import entities.EmployeeTitle;
import entities.EmployeesNTitles;

import javax.persistence.*;
import java.util.List;

public class TestSystem<T extends Entity> implements OperationsCRUD<T>{
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("jpaentity");


    @Override
    public List<T> entityList() {
        return null;
    }

    @Override
    public List<T> findAll(String tableType) {
        EntityManager entityManager =ENTITY_MANAGER_FACTORY.createEntityManager();
        String queryTemplate = "SELECT e FROM %s e WHERE e.id IS NOT NULL";
        String query = String.format(queryTemplate, tableType);
        Query statement= entityManager.createQuery(query);
        List entityList;


        try {
            entityList=statement.getResultList();

            entityList.forEach(ent -> {
                if (ent instanceof Employee) {
                    System.out.println(((Employee) ent).getEmpId() +" -> " +
                            ((Employee) ent).getFirstName() + " " +
                            ((Employee) ent).getLastName() + " " +
                            ((Employee) ent).getHireDate());
                }
                if (ent instanceof EmployeeTitle) {
                    System.out.println(((EmployeeTitle) ent).getEmpId() +" -> " +
                            ((EmployeeTitle) ent).getTitle() + " from:" +
                            ((EmployeeTitle) ent).getStartDate() + "\t to:" +
                            ((EmployeeTitle) ent).getEndDate());
                }
                if (ent instanceof EmployeesNTitles) {
                    System.out.println(((EmployeesNTitles) ent).getEmpId()+" -> "+
                            ((EmployeesNTitles) ent).getFirstName() +" "+
                            ((EmployeesNTitles) ent).getLastName() +" | "+
                            ((EmployeesNTitles) ent).getTitle());
                }
            });
            if (entityList==null || entityList.isEmpty()) {
                entityList=null;
            }
        }
        finally {
            entityManager.close();
        }
        return entityList;
    }

    @Override
    public T findOne(String tableType, String id) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String queryTemplate = "SELECT e FROM %s e" + " WHERE e.id=:id";
        String query = String.format(queryTemplate, tableType);
        Query statement = entityManager.createQuery(query);
        statement.setParameter("id", id);

        Object ent = null;
        try {
//            ent= (T) statement.getSingleResult();
            if (statement.getSingleResult() instanceof Employee) {
                ent = statement.getSingleResult();
                System.out.println(((Employee) ent).getEmpId() + " -> " +
                        ((Employee) ent).getFirstName() + " " +
                        ((Employee) ent).getLastName() + "\t hired:" +
                        ((Employee) ent).getHireDate());
            }
        } catch (NoResultException nores) {
            throw nores;
        } finally {
            entityManager.close();
        }
        return (T)ent;
    }

    @Override
    public String add(T entityType) {
        return null;
    }

    @Override
    public String delete(String id) {
        return null;
    }
}

//
//    public static void getCustomers() {
//        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
//        String strQuery = "SELECT e FROM EmployeeEntity e WHERE e.id IS NOT NULL";
//        TypedQuery<EmployeeEntity> tq = em.createQuery(strQuery, EmployeeEntity.class);
//        List<EmployeeEntity> employees;
//        try {
//            employees = tq.getResultList();
//            employees.forEach(emp -> System.out.println(emp
//                    .getEmpId() + " -> " +emp.getFirstName() + " " +emp.getLastName()));
//        }
//        catch (NoResultException ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            em.close();
//        }
//    }
