package com.swift.swiftblog.mapper;

import com.swift.swiftblog.pojo.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where user_name = #{userName}")
    Admin findByUserName(String userName);
}
