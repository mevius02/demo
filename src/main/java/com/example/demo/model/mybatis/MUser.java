package com.example.demo.model.mybatis;

import java.util.Date;

public class MUser {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.update_cnt
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private Integer updateCnt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.password
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.role_cd
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private String roleCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.user_nm
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private String userNm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.account_expiration
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private Date accountExpiration;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.password_expiration
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private Date passwordExpiration;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.enabled
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private Boolean enabled;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.deleted
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private Boolean deleted;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.insert_user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private String insertUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.insert_timestamp
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private Date insertTimestamp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.update_user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private String updateUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.update_timestamp
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private Date updateTimestamp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.delete_user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private String deleteUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.m_user.delete_timestamp
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	private Date deleteTimestamp;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.user_id
	 * @return  the value of public.m_user.user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.user_id
	 * @param userId  the value for public.m_user.user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.id
	 * @return  the value of public.m_user.id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.id
	 * @param id  the value for public.m_user.id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.update_cnt
	 * @return  the value of public.m_user.update_cnt
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public Integer getUpdateCnt() {
		return updateCnt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.update_cnt
	 * @param updateCnt  the value for public.m_user.update_cnt
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setUpdateCnt(Integer updateCnt) {
		this.updateCnt = updateCnt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.password
	 * @return  the value of public.m_user.password
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.password
	 * @param password  the value for public.m_user.password
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.role_cd
	 * @return  the value of public.m_user.role_cd
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public String getRoleCd() {
		return roleCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.role_cd
	 * @param roleCd  the value for public.m_user.role_cd
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.user_nm
	 * @return  the value of public.m_user.user_nm
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public String getUserNm() {
		return userNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.user_nm
	 * @param userNm  the value for public.m_user.user_nm
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.account_expiration
	 * @return  the value of public.m_user.account_expiration
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public Date getAccountExpiration() {
		return accountExpiration;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.account_expiration
	 * @param accountExpiration  the value for public.m_user.account_expiration
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setAccountExpiration(Date accountExpiration) {
		this.accountExpiration = accountExpiration;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.password_expiration
	 * @return  the value of public.m_user.password_expiration
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public Date getPasswordExpiration() {
		return passwordExpiration;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.password_expiration
	 * @param passwordExpiration  the value for public.m_user.password_expiration
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setPasswordExpiration(Date passwordExpiration) {
		this.passwordExpiration = passwordExpiration;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.enabled
	 * @return  the value of public.m_user.enabled
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.enabled
	 * @param enabled  the value for public.m_user.enabled
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.deleted
	 * @return  the value of public.m_user.deleted
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public Boolean getDeleted() {
		return deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.deleted
	 * @param deleted  the value for public.m_user.deleted
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.insert_user_id
	 * @return  the value of public.m_user.insert_user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public String getInsertUserId() {
		return insertUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.insert_user_id
	 * @param insertUserId  the value for public.m_user.insert_user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setInsertUserId(String insertUserId) {
		this.insertUserId = insertUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.insert_timestamp
	 * @return  the value of public.m_user.insert_timestamp
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public Date getInsertTimestamp() {
		return insertTimestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.insert_timestamp
	 * @param insertTimestamp  the value for public.m_user.insert_timestamp
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setInsertTimestamp(Date insertTimestamp) {
		this.insertTimestamp = insertTimestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.update_user_id
	 * @return  the value of public.m_user.update_user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public String getUpdateUserId() {
		return updateUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.update_user_id
	 * @param updateUserId  the value for public.m_user.update_user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.update_timestamp
	 * @return  the value of public.m_user.update_timestamp
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.update_timestamp
	 * @param updateTimestamp  the value for public.m_user.update_timestamp
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.delete_user_id
	 * @return  the value of public.m_user.delete_user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public String getDeleteUserId() {
		return deleteUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.delete_user_id
	 * @param deleteUserId  the value for public.m_user.delete_user_id
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setDeleteUserId(String deleteUserId) {
		this.deleteUserId = deleteUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.m_user.delete_timestamp
	 * @return  the value of public.m_user.delete_timestamp
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public Date getDeleteTimestamp() {
		return deleteTimestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.m_user.delete_timestamp
	 * @param deleteTimestamp  the value for public.m_user.delete_timestamp
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	public void setDeleteTimestamp(Date deleteTimestamp) {
		this.deleteTimestamp = deleteTimestamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.m_user
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		MUser other = (MUser) that;
		return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
				&& (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getUpdateCnt() == null ? other.getUpdateCnt() == null
						: this.getUpdateCnt().equals(other.getUpdateCnt()))
				&& (this.getPassword() == null ? other.getPassword() == null
						: this.getPassword().equals(other.getPassword()))
				&& (this.getRoleCd() == null ? other.getRoleCd() == null : this.getRoleCd().equals(other.getRoleCd()))
				&& (this.getUserNm() == null ? other.getUserNm() == null : this.getUserNm().equals(other.getUserNm()))
				&& (this.getAccountExpiration() == null ? other.getAccountExpiration() == null
						: this.getAccountExpiration().equals(other.getAccountExpiration()))
				&& (this.getPasswordExpiration() == null ? other.getPasswordExpiration() == null
						: this.getPasswordExpiration().equals(other.getPasswordExpiration()))
				&& (this.getEnabled() == null ? other.getEnabled() == null
						: this.getEnabled().equals(other.getEnabled()))
				&& (this.getDeleted() == null ? other.getDeleted() == null
						: this.getDeleted().equals(other.getDeleted()))
				&& (this.getInsertUserId() == null ? other.getInsertUserId() == null
						: this.getInsertUserId().equals(other.getInsertUserId()))
				&& (this.getInsertTimestamp() == null ? other.getInsertTimestamp() == null
						: this.getInsertTimestamp().equals(other.getInsertTimestamp()))
				&& (this.getUpdateUserId() == null ? other.getUpdateUserId() == null
						: this.getUpdateUserId().equals(other.getUpdateUserId()))
				&& (this.getUpdateTimestamp() == null ? other.getUpdateTimestamp() == null
						: this.getUpdateTimestamp().equals(other.getUpdateTimestamp()))
				&& (this.getDeleteUserId() == null ? other.getDeleteUserId() == null
						: this.getDeleteUserId().equals(other.getDeleteUserId()))
				&& (this.getDeleteTimestamp() == null ? other.getDeleteTimestamp() == null
						: this.getDeleteTimestamp().equals(other.getDeleteTimestamp()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.m_user
	 * @mbg.generated  Sat Nov 26 13:37:05 JST 2022
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getUpdateCnt() == null) ? 0 : getUpdateCnt().hashCode());
		result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
		result = prime * result + ((getRoleCd() == null) ? 0 : getRoleCd().hashCode());
		result = prime * result + ((getUserNm() == null) ? 0 : getUserNm().hashCode());
		result = prime * result + ((getAccountExpiration() == null) ? 0 : getAccountExpiration().hashCode());
		result = prime * result + ((getPasswordExpiration() == null) ? 0 : getPasswordExpiration().hashCode());
		result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
		result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
		result = prime * result + ((getInsertUserId() == null) ? 0 : getInsertUserId().hashCode());
		result = prime * result + ((getInsertTimestamp() == null) ? 0 : getInsertTimestamp().hashCode());
		result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
		result = prime * result + ((getUpdateTimestamp() == null) ? 0 : getUpdateTimestamp().hashCode());
		result = prime * result + ((getDeleteUserId() == null) ? 0 : getDeleteUserId().hashCode());
		result = prime * result + ((getDeleteTimestamp() == null) ? 0 : getDeleteTimestamp().hashCode());
		return result;
	}
}