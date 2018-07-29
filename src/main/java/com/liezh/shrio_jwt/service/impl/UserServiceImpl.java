package com.liezh.shrio_jwt.service.impl;

import com.liezh.shrio_jwt.dao.UserDao;
import com.liezh.shrio_jwt.domain.entity.User;
import com.liezh.shrio_jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/7/29.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User findById(Integer id) {
        return null;
    }
}
