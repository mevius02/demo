package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import com.example.demo.common.GlobalVariable;

@Controller
@RequestMapping("/login")
public class LoginController extends GlobalVariable {

	/**
	 * ログインメソッド
	 * ID,PW有力し、ログイン実行後「UserDetailsService」に処理が進む
	 * →「UserDetailsService」を継承したクラスがあれば、そのクラスに処理が進む
	 */
	@GetMapping("")
	public String login(Model model) {
		String failureMsg = (String) model.getAttribute(FAILURE_MSG_KEY);
		if (!StringUtils.isEmpty(failureMsg)) {
			model.addAttribute(FAILURE_MSG_KEY, failureMsg);
		}
		return "login";
	}
}
