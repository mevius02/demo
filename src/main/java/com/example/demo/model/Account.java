package com.example.demo.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Account {

	/** M_USER 更新回数 */
	private Integer userUpdateCnt;
	/** ユーザーID */
	private String userId;
	/** 現在パスワード */
	@Length(max = 30)
	private String currentPassword;
	/** 新規パスワード */
	@Length(max = 30)
	private String newPassword;
	/** 新規パスワード[確認用] */
	@Length(max = 30)
	private String newPasswordConfirmation;
	/** 権限CD */
	private String roleCd;
	/** 権限名 */
	private String roleNm;
	/** ユーザー名 */
	@NotBlank
	@Length(max = 20)
	private String userNm;
	/** アカウント有効期限 */
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date accountExpiration;
	/** パスワード有効期限 */
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
	private Date passwordExpiration;
	/** アカウント有効フラグ */
	private Boolean enabled;
	/** M_USER 登録ユーザーID */
	private String userInsertUserId;
	/** M_USER 登録日時 */
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private Date userInsertTimestamp;
	/** M_USER 更新ユーザーID */
	private String userUpdateUserId;
	/** M_USER 更新日時 */
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private Date userUpdateTimestamp;
	/** M_USER_DETAIL 更新回数 */
	private Integer detailUpdateCnt;
	/** 姓 */
	@Length(max = 20)
	private String lastNm;
	/** 名 */
	@Length(max = 20)
	private String firstNm;
	/** 姓[カナ] */
	@Length(max = 20)
	private String lastNmKana;
	/** 名[カナ] */
	@Length(max = 20)
	private String firstNmKana;
	/** 性別 */
	private String gender;
	/** 生年月日 */
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dateOfBirth;
	/** 年齢 */
	private Integer age;
	/** 血液型 */
	private String bloodType;
	/** 郵便番号 */
	@Length(max = 8)
	private String postNo;
	/** 都道府県 */
	private String prefecture;
	/** 住所 */
	@Length(max = 100)
	private String address;
	/** 住所[カナ] */
	@Length(max = 100)
	private String addressKana;
	/** 電話番号 */
	@Length(max = 13)
	private String phoneNo;
	/** 携帯番号 */
	@Length(max = 13)
	private String mobilePhoneNo;
	/** メールアドレス */
	@Length(max = 100)
	private String mailAddress;
	/** システムテーマCD */
	private String systemThemaCd;
	/** システムテーマ名 */
	private String systemThemaNm;
	/** M_USER_DETAIL 登録ユーザーID */
	private String detailInsertUserId;
	/** M_USER_DETAIL 登録日時 */
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private Date detailInsertTimestamp;
	/** M_USER_DETAIL 更新ユーザーID */
	private String detailUpdateUserId;
	/** M_USER_DETAIL 更新日時 */
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private Date detailUpdateTimestamp;
}
