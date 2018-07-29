package com.liezh.shrio_jwt.controller;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/7/29.
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/0")
    @RequiresAuthentication
    public String test0() {
        return "Authentication 需要登录";
    }

    @GetMapping("/1")
    @RequiresPermissions({"view", "edit"})
    public String test1() {
        return "Permissions 需要权限";
    }

    @GetMapping("/2")
    @RequiresRoles("admin")
    public String test2() {
        return "Roles 需要角色";
    }

}
