package com.gdou.HotelSystem.service;


import com.gdou.HotelSystem.User;
import com.gdou.HotelSystem.service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
//    @Autowired
//    UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }
}
