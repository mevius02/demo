package com.example.demo.model;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;

/* セッション保持されるログイン情報 */
@Getter
public class UserDetailsImpl implements UserDetails {

	/** ユーザーID */
	private String userId;
	/** パスワード */
	private String password;
	/** 権限ロールCD */
	private String roleCd;
	/** ユーザー名 */
	private String userNm;
	/** アカウント有効期限 */
	private Date accountExpiration;
	/** パスワード有効期限 */
	private Date passwordExpiration;
	/** アカウント有効フラグ */
	private boolean enabled;

	@Override
	public String getUsername() {
		return this.userId;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("ROLE_" + this.roleCd);
	}

	/**
	 * アカウントの有効チェック
	 * true : 有効 / false : 無効
	 */
	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

	/**
	 * アカウントの有効チェック
	 * true : 有効 / false : 無効
	 */
	@Override
	public boolean isAccountNonLocked() {
		return this.enabled;
	}

	/**
	 * アカウントの有効期限チェック
	 * true : 有効 / false : 無効
	 */
	@Override
	public boolean isAccountNonExpired() {
		if (this.accountExpiration.after(new Date())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * パスワードの有効期限チェック
	 * true : 有効 / false : 無効
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		if (this.passwordExpiration.after(new Date())) {
			return true;
		} else {
			return false;
		}
	}
}
