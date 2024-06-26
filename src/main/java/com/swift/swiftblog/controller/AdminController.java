package com.swift.swiftblog.controller;

import com.swift.swiftblog.pojo.Result;
import com.swift.swiftblog.pojo.entity.Admin;
import com.swift.swiftblog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/login")
    public Result<String> AdminLogin(Admin admin){

        String token = adminService.login(admin);
        return Result.success(token);
    }
}
