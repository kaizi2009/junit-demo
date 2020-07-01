package com.github.junit.demo;

import com.github.junit.demo.entity.User;
import com.github.junit.demo.service.UserService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

public class Test5User extends BaseTest {

    @Resource
    private UserService userService;

    /*@Test
    @DataSet(value = "datasets/xml/users.xml")
    public void getUserById() {
        User user = userService.getById(1L);
        System.out.println(user.getName());
    }*/

    @Test
    public void getUserById() {
        User user = userService.getById(999L);
//        System.out.println(user.getName());
    }

    @Test
    public void getUserById1() {
        User user = userService.getById(999L);
//        System.out.println(user.getName());
    }
}
