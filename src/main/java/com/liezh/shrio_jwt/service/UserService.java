package com.liezh.shrio_jwt.service;

import com.liezh.shrio_jwt.domain.entity.User;

/**
 * Created by Administrator on 2018/7/29.
 */
public interface UserService {

    User findByUsername(String username);

    User findById(Integer id);

}
