package com.example.demo.service.common;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CommonService{
	/**
	 * SQLのLIKE検索用に、引数文字列の両端に"%"を付与し返す
	 * <br>※NULL or 空の場合、そのまま返す
	 * @param param 文字列
	 * @return LIKE検索用の文字列
	 * <br>例) "aaa" → "%aaa%"
	 */
	public String createSqlParamLike(String param){
		if(StringUtils.isEmpty(param)){
			return param;
		}else{
			return "%" + param + "%";
		}
	}

	/**
	 * SQLのLIKE検索用に、引数文字列の先頭に"%"を付与し返す
	 * <br>※NULL or 空の場合、そのまま返す
	 * @param param 文字列
	 * @return LIKE検索用の文字列
	 * <br>例) "aaa" → "%aaa"
	 */
	public String createSqlParamLikeTop(String param){
		if(StringUtils.isEmpty(param)){
			return param;
		}else{
			return "%" + param;
		}
	}

	/**
	 * SQLのLIKE検索用に、引数文字列の末尾に"%"を付与し返す
	 * <br>※NULL or 空の場合、そのまま返す
	 * @param param 文字列
	 * @return LIKE検索用の文字列
	 * <br>例) "aaa" → "aaa%"
	 */
	public String createSqlParamLikeEnd(String param){
		if(StringUtils.isEmpty(param)){
			return param;
		}else{
			return param + "%";
		}
	}
}
