package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user_role")
public class UserRole {

	@Id
	@Column(name = "serial_no")
	private Integer serialNo;

	@Column(name = "user_id")
	private String username;

	@Column(name = "role_cd")
	private String roleCd;

	public UserRole() {
	}

	public UserRole(String userId, String roleCd) {
		this.username = userId;
		this.roleCd = roleCd;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getUserId() {
		return username;
	}

	public void setUserId(String userId) {
		this.username = userId;
	}

	public String getRoleCd() {
		return roleCd;
	}

	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}
}
