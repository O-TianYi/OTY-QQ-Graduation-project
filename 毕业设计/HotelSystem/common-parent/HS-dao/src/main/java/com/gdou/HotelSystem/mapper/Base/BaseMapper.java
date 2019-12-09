package com.gdou.HotelSystem.mapper.Base;

public interface BaseMapper<T> {
    public T findById(Integer id);
    public void deleteById(Integer id);
    public void update(T t);
    public void insert(T t);
}
