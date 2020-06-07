package com.github.junit.demo;

import com.github.junit.demo.entity.User;
import com.github.junit.demo.service.UserService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

public class Test1User extends BaseTest {

    @Resource
    private UserService userService;

    @Test
    public void getUserById() {
        User user = userService.getById(1L);
        System.out.println(user.getName());
    }
}
