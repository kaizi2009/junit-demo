package com.github.junit.demo;

import com.github.junit.demo.dao.UserDao;
import com.github.junit.demo.entity.User;
import com.github.junit.demo.service.UserService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

public class TestUser extends BaseTest {

    @Resource
    private UserService userService;
    @Resource
    private UserDao userDao;

    /*@Test
    public void getUserById() {
        User user = userService.getById(999L);
        System.out.println(user.getName());
    }*/

    @Test
    public void delete() {
        userDao.delete(999);
    }

}
