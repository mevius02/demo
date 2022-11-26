package com.example.demo.login;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {

	private User account;

	public UserDetailsImpl(User account) {
		this.account = account;
	}

	@Override
	public String getUsername() {
		return account.getUserId();
	}

	public String getUserId() {
		return account.getUserId();
	}

	@Override
	public String getPassword() {
		return account.getPassword();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("ROLE_" + this.account.getRoleCd());
	}

	public String getRoleCd() {
		return account.getRoleCd();
	}

	public String getUserNm() {
		return account.getUserNm();
	}

	public Date getAccountExpiration() {
		return account.getAccountExpiration();
	}

	public Date getPasswordExpiration() {
		return account.getPasswordExpiration();
	}

	/**
	 * アカウントの有効チェック
	 * true : 有効 / false : 無効
	 */
	@Override
	public boolean isEnabled() {
		return account.isEnabled();
	}

	/**
	 * アカウントの有効チェック
	 * true : 有効 / false : 無効
	 */
	@Override
	public boolean isAccountNonLocked() {
		return account.isEnabled();
	}

	/**
	 * アカウントの有効期限チェック
	 * true : 有効 / false : 無効
	 */
	@Override
	public boolean isAccountNonExpired() {
		if (account.getAccountExpiration().after(new Date())) {
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
		if (account.getPasswordExpiration().after(new Date())) {
			return true;
		} else {
			return false;
		}
	}
}
