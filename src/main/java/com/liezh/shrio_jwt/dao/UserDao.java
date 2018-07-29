package com.liezh.shrio_jwt.dao;

import com.liezh.shrio_jwt.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/7/29.
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
