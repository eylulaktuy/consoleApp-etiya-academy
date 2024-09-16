package org.example.dataAccess;

import java.util.ArrayList;

public interface IEntityRepository<T extends IEntity> {
    void add(T entity);
    void list(T entity);
    void delete(T entity);
}

//generic constrains