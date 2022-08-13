package services;

import java.util.List;

public interface OperationsCRUD<Table> {
    List<Table> entityList();

    Table findAll();

    Table findOne(String id);

    String add(Table entityType);

    String delete(String id);
}
