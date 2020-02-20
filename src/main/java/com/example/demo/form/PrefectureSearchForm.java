package com.example.demo.form;

import javax.validation.constraints.Size;

import lombok.Data;

/** 検索条件フォーム */
@Data
public class PrefectureSearchForm{
	/** 都道府県名 */
	@Size(max = 10, message = "都道府県名は10桁以内で入力してください")
	private String name;
	/** 都道府県名(ひらがな) */
	@Size(max = 10, message = "都道府県名(ひらがな)は10桁以内で入力してください")
	private String nameHira;
	/** 都道府県名(カタカナ) */
	@Size(max = 10, message = "都道府県名(カタカナ)は10桁以内で入力してください")
	private String nameKana;
	/** 都道府県名(ローマ字) */
	@Size(max = 10, message = "都道府県名(ローマ字)は10桁以内で入力してください")
	private String nameRoma;
}
