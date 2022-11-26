package com.example.demo.mapper;

import com.example.demo.model.mybatis.MUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	int updateMyAccount(MUser user);
}