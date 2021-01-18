package com.example.springboot_mybatis.controller;

import com.example.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id) {

        //return "123";
        return userService.Sel(id).toString();
    }
}