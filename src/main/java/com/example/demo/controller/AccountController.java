package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.util.StringUtils;

import com.example.demo.common.GlobalVariable;
import com.example.demo.form.AccountForm;
import com.example.demo.login.UserDetailsImpl;
import com.example.demo.model.mybatis.MUser;
import com.example.demo.service.UserService;
import com.example.demo.service.common.DropDownService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/account")
public class AccountController extends GlobalVariable {

	@Autowired
	private UserService userService;
	@Autowired
	private DropDownService dropDownService;

	@GetMapping("search")
	public String search(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session) {
		// ↓↓↓↓↓ 更新成功後の処理 ↓↓↓↓↓
		String redirectSuccessMsg = (String) model.getAttribute(RDIRECT_SUCCESS_MSG_KEY);
		if (!StringUtils.isEmpty(redirectSuccessMsg)) {
			model.addAttribute(RDIRECT_SUCCESS_MSG_KEY, redirectSuccessMsg);
		}
		// ↑↑↑↑↑ 更新成功後の処理 ↑↑↑↑↑
		MUser account = userService.selectMyAccount(principal.getUserId());
		model.addAttribute("account", account);
		return "account/accountSearch";
	}

	@GetMapping("edit")
	public String edit(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session) {
		MUser account = userService.selectMyAccount(principal.getUserId());
		// パスワードは初期値NULL
		account.setPassword(null);
		AccountForm accountForm = new AccountForm();
		BeanUtils.copyProperties(account, accountForm);
		model.addAttribute("accountForm", accountForm);
		model.addAttribute("systemThemaList", dropDownService.getSystemThemaList());
		return "account/accountEdit";
	}

	@PostMapping("confirm")
	public String confirm(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session,
			AccountForm accountForm,
			RedirectAttributes redirectAttributes) {
		String resultMsg = userService.updateMyAccount(principal.getUserId(), accountForm);
		// 成功の場合
		if (StringUtils.equals(RETURN_SUCCESS, resultMsg)) {
			redirectAttributes.addFlashAttribute(RDIRECT_SUCCESS_MSG_KEY, UPDATE_SUCCESS_MSG);
			// 失敗の場合
		} else if (StringUtils.equals(RETURN_FAILURE, resultMsg)) {
			model.addAttribute(FAILURE_MSG_KEY, UPDATE_FAILURE_MSG);
			model.addAttribute("accountForm", accountForm);
			model.addAttribute("systemThemaList", dropDownService.getSystemThemaList());
			return "/account/accountEdit";
			// その他、エラーの場合
		} else if (!StringUtils.isEmpty(resultMsg)) {
			model.addAttribute(FAILURE_MSG_KEY, resultMsg);
			model.addAttribute("accountForm", accountForm);
			model.addAttribute("systemThemaList", dropDownService.getSystemThemaList());
			return "/account/accountEdit";
		}
		return REDIRECT + "/account/search";
	}
}
