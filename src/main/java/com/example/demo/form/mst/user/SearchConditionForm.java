package com.example.demo.form.mst.user;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchConditionForm {

	/** ユーザーID */
	private String userId;
	/** ユーザー名 */
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
	private String insertUserId;
	/** M_USER 登録日時 */
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private Date insertTimestamp;
	/** M_USER 更新ユーザーID */
	private String updateUserId;
	/** M_USER 更新日時 */
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private Date updateTimestamp;
}
