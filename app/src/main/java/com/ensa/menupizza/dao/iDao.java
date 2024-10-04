package com.ensa.menupizza.dao;

import java.util.List;

public interface iDao<T> {
     boolean create(T o);

     boolean update(T o);
     boolean delete(T o);

     List<T> findall();


     T findByid(int id);
}
