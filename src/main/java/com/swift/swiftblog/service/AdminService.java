package com.swift.swiftblog.service;

import com.swift.swiftblog.pojo.entity.Admin;

public interface AdminService {
    /**
     * 管理员登录的方法
     * @param admin
     * @return
     */
    String login(Admin admin);
}
