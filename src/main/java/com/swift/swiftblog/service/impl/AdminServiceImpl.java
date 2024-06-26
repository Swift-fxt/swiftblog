package com.swift.swiftblog.service.impl;

import com.swift.swiftblog.constant.MessageConstant;
import com.swift.swiftblog.exception.AccountNotFoundException;
import com.swift.swiftblog.mapper.AdminMapper;
import com.swift.swiftblog.pojo.entity.Admin;
import com.swift.swiftblog.service.AdminService;
import com.swift.swiftblog.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public String login(Admin admin) {
        String userName = admin.getUserName();
        String passWord = admin.getPassword();

        Admin admin1 = adminMapper.findByUserName(userName);

        if(admin1 == null){
            throw new AccountNotFoundException(MessageConstant.ACCOUNT_NOT_FOUND);
        }

        return null;
    }
}
