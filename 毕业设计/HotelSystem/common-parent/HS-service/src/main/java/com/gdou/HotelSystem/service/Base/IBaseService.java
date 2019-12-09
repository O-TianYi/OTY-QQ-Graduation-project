package com.gdou.HotelSystem.service.Base;

public interface IBaseService<T> {
    public T findById(Integer id);
    public void deleteById(Integer id);
    public void update(T t);
    public void insert(T t);
}
