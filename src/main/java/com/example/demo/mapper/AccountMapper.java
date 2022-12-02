package com.example.demo.mapper;

import com.example.demo.model.Account;
import com.example.demo.model.mybatis.MUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

	/**
	 * [検索] Mユーザー
	 * 
	 * @param userId ユーザーID
	 * @return アカウント情報
	 */
	Account selectMyAccount(String userId);

	/**
	 * [更新] Mユーザー
	 * 
	 * @param user 更新レコード
	 * @return 更新レコード数
	 */
	int updateMyAccount(MUser user);
}
