package com.swift.swiftblog.interceptor;


import com.swift.swiftblog.properties.JwtProperties;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
@Slf4j
public class JwtTokenAdminInterceptor implements HandlerInterceptor {
    @Autowired
    private JwtProperties jwtProperties;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        log.info("生成拦截器");
        String token = request.getHeader(jwtProperties.getAdminTokenName());//获取token

        return false;
    }
}
