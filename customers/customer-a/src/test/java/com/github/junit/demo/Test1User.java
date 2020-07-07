package com.github.junit.demo;

import com.github.database.rider.core.api.dataset.DataSet;
import com.github.junit.demo.entity.User;
import com.github.junit.demo.service.UserService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

public class Test1User extends BaseTest {

    @Resource
    private UserService userService;

    @Test
    @DataSet(value = "datasets/xml/users.xml")
    public void getUserByIdInXml() {
        User user = userService.getById(100L);
        System.out.println(user.getName());
    }

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
