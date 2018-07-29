package com.liezh.shrio_jwt.controller;

import com.liezh.shrio_jwt.domain.dto.ResponseDto;
import com.liezh.shrio_jwt.domain.entity.User;
import com.liezh.shrio_jwt.security.util.JWTUtil;
import com.liezh.shrio_jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/7/29.
 */
@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/login")
    public ResponseDto<String> login(String username, String password) {
        User user = userService.findByUsername(username);
        if (user == null
                || !user.getPassword().equals(password)) {
            return new ResponseDto<>(0, null, "用户名密码错误");
        }
//        Subject subject = SecurityUtils.getSubject();
//        subject.login(username);
        String token = jwtUtil.generateToken(user.getUsername());
        return new ResponseDto<>(200, token, "成功");
    }


}
