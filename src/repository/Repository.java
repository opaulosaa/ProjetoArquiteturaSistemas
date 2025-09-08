package repository;

import java.util.*;

public interface Repository<T> {
    void save(T entity);
    void delete(T entity);
    List<T> findAll();
    Optional<T> findById(int id);
}