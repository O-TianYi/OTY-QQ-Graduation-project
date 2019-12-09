package com.gdou.HotelSystem.service;

import com.gdou.HotelSystem.User;
import com.gdou.HotelSystem.service.Base.IBaseService;

public interface IUserService extends IBaseService<User> {

    //自己的特有的私有方法
    public User login(String username,String password);
}
