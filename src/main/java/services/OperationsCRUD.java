package services;

import entities.Employee;

import java.util.List;

public interface OperationsCRUD<T>{
    List<T> entityList();

    List<T> findAll(String type);

//    Employee findAll(String table);

    T findOne(String id, String tableType);

    String add(T entityType);

    String delete(String id);
}
