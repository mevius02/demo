package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.UserDetailsImpl;

@Mapper
public interface LoginMapper {

	@Select(" SELECT " +
			"   muser.user_id AS user_id " +
			"   , muser.password AS password " +
			"   , turole.role_cd AS role_cd " +
			"   , muser.user_nm AS user_nm " +
			"   , muser.account_expiration AS account_expiration " +
			"   , muser.password_expiration AS password_expiration " +
			"   , muser.enabled AS enabled " +
			" FROM m_user muser " +
			"   INNER JOIN t_user_role turole ON (muser.user_id = turole.user_id) " +
			" WHERE " +
			"   muser.user_id = #{userId} ")
	UserDetailsImpl selectUser(String userId);
}
