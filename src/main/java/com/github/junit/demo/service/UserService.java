package com.github.junit.demo.service;

import com.github.junit.demo.dao.UserDao;
import com.github.junit.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public User getById(Long id) {
        return userDao.getById(id);
    }
}
