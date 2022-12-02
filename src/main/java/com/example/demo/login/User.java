package com.example.demo.login;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_user")
public class User {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "update_cnt")
	private String updateCnt;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "password")
	private String password;

	@Column(name = "role_cd")
	private String roleCd;

	@Column(name = "user_nm")
	private String userNm;

	@Column(name = "account_expiration")
	private Date accountExpiration;

	@Column(name = "password_expiration")
	private Date passwordExpiration;

	@Column(name = "enabled")
	private boolean enabled;

	public User() {
	}

	public User(String userId, String password, String roleCd) {
		this.userId = userId;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public String getUpdateCnt() {
		return updateCnt;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public String getRoleCd() {
		return roleCd;
	}

	public String getUserNm() {
		return userNm;
	}

	public Date getAccountExpiration() {
		return accountExpiration;
	}

	public Date getPasswordExpiration() {
		return passwordExpiration;
	}

	public boolean isEnabled() {
		return enabled;
	}
}
