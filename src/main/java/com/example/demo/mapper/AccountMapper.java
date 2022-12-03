package com.example.demo.mapper;

import com.example.demo.model.Account;
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
}
