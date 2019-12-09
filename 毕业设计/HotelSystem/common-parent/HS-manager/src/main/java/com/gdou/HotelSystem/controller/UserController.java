package com.gdou.HotelSystem.controller;


import com.gdou.HotelSystem.User;
import com.gdou.HotelSystem.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

//    @Autowired
//    UserServiceImpl userService;
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("控制台打印出就成功了");
        return "页面应该显示这句内容";
    }


    @RequestMapping("find")
    public String find(Integer id){
        System.out.println(".....");
        User user=userService.findById(id);
        System.out.println("========"+user);
        return null;
    }


}
