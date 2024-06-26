package com.swift.swiftblog.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Integer id;
    private String userName;
    private String password;
    private String name;
    private String avatar;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
