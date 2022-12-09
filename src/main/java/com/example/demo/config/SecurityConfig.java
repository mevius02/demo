package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.common.GlobalVariable;
import com.example.demo.service.common.CommonService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class SecurityConfig extends GlobalVariable {

	@Autowired
	private CommonService commonService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable();

		http.authorizeHttpRequests(auth -> auth
				// 下記URLは誰でもアクセス可能
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
				.mvcMatchers("/login").permitAll()
				// 下記URLは各権限の場合のみアクセス可能
				.mvcMatchers("/account/edit").hasAnyRole("SUPER-ADMIN")
				.mvcMatchers("/account/check-edit").hasAnyRole("SUPER-ADMIN")
				.mvcMatchers("/account/confirm-edit").hasAnyRole("SUPER-ADMIN")
				// .mvcMatchers("/mst/**").hasAnyRole(commonService.getApiRoleList("MST"))
				// 設定外のURLアクセスをすべて拒否設定
				// .anyRequest().denyAll());
				// 設定外のURLアクセスをすべて許可設定
				.anyRequest().authenticated())
				.exceptionHandling().accessDeniedPage("/system-error");

		http.formLogin(login -> login
				.loginPage("/login")
				.loginProcessingUrl("/login")
				.usernameParameter("userId")
				.passwordParameter("password")
				.defaultSuccessUrl("/home", false)
				.failureUrl("/login?error"))
				.rememberMe();

		http.logout(logout -> logout
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login?logout")
				.deleteCookies("JSESSIONID")
				.invalidateHttpSession(true));

		return http.build();
	}
}
