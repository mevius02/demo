package com.example.demo.form;

import java.util.Date;

public class AccountForm {
	public String userId;
	public String userNm;
	public String currentPassword;
	public String newPassword;
	public String newPasswordConfirmation;
	public String roleCd;
	public String mailAddress;
	public String systemThemaCd;
	public Date accountExpiration;
	public Date passwordExpiration;
	public Boolean enabled;
	public Boolean deleted;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getNewPasswordConfirmation() {
		return newPasswordConfirmation;
	}

	public void setNewPasswordConfirmation(String newPasswordConfirmation) {
		this.newPasswordConfirmation = newPasswordConfirmation;
	}

	public String getRoleCd() {
		return roleCd;
	}

	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getSystemThemaCd() {
		return systemThemaCd;
	}

	public void setSystemThemaCd(String systemThemaCd) {
		this.systemThemaCd = systemThemaCd;
	}

	public Date getAccountExpiration() {
		return accountExpiration;
	}

	public void setAccountExpiration(Date accountExpiration) {
		this.accountExpiration = accountExpiration;
	}

	public Date getPasswordExpiration() {
		return passwordExpiration;
	}

	public void setPasswordExpiration(Date passwordExpiration) {
		this.passwordExpiration = passwordExpiration;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
}