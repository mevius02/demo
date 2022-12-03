package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.util.StringUtils;

import com.example.demo.common.GlobalVariable;
import com.example.demo.form.AccountForm;
import com.example.demo.login.UserDetailsImpl;
import com.example.demo.model.Account;
import com.example.demo.service.AccountService;
import com.example.demo.service.common.CommonService;

// ↓ ログ出力で使う
// import lombok.extern.slf4j.Slf4j;
// @Slf4j
// log.info("msg");
@Controller
@RequestMapping("/account")
public class AccountController extends GlobalVariable {

	@Autowired
	private CommonService commonService;
	@Autowired
	private AccountService accountService;

	private String ACCOUNT_SEARCH = "account/accountSearch";
	private String ACCOUNT_EDIT = "account/accountEdit";

	@GetMapping("search")
	public String search(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session) {
		// ↓↓↓↓↓ 更新成功後の処理 ↓↓↓↓↓
		String redirectSuccessMsg = (String) model.getAttribute(RDIRECT_SUCCESS_MSG_KEY);
		if (!StringUtils.isEmpty(redirectSuccessMsg)) {
			model.addAttribute(RDIRECT_SUCCESS_MSG_KEY, redirectSuccessMsg);
		}
		// ↑↑↑↑↑ 更新成功後の処理 ↑↑↑↑↑
		AccountForm accountForm = new AccountForm();
		Account account = accountService.selectMyAccount(principal.getUserId());
		accountForm.setAccount(account);
		model.addAttribute("accountForm", accountForm);
		return ACCOUNT_SEARCH;
	}

	@GetMapping("edit")
	public String edit(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session) {
		AccountForm accountForm = new AccountForm();
		Account account = accountService.selectMyAccount(principal.getUserId());
		accountForm.setAccount(account);
		model.addAttribute("accountForm", accountForm);
		// dropdownセット
		commonService.setTheDropdownInTheModel(model);
		return ACCOUNT_EDIT;
	}

	@PostMapping("confirm")
	public String confirm(Model model, @AuthenticationPrincipal UserDetailsImpl principal,
			HttpSession session,
			@Validated @ModelAttribute AccountForm accountForm, BindingResult result,
			RedirectAttributes redirectAttributes) {
		// 追加入力エラーチェック
		accountService.formErrorCheckMyAccount(principal.getUserId(), accountForm, result);
		// 入力エラー有の場合
		if (result.hasErrors()) {
			// dropdownセット
			commonService.setTheDropdownInTheModel(model);
			return ACCOUNT_EDIT;
		}
		// [更新] M_USER, M_USER_DETAIL
		String resultMsg = accountService.updateMyAccount(principal.getUserId(), accountForm);

		// 失敗の場合
		if (StringUtils.equals(RETURN_FAILURE, resultMsg)) {
			model.addAttribute(FAILURE_MSG_KEY, UPDATE_FAILURE_MSG);
			// dropdownセット
			commonService.setTheDropdownInTheModel(model);
			return ACCOUNT_EDIT;
		}
		// その他、エラーの場合
		if (!StringUtils.equals(RETURN_SUCCESS, resultMsg) && !StringUtils.equals(RETURN_FAILURE, resultMsg)
				&& !StringUtils.isEmpty(resultMsg)) {
			model.addAttribute(FAILURE_MSG_KEY, resultMsg);
			// dropdownセット
			commonService.setTheDropdownInTheModel(model);
			return ACCOUNT_EDIT;
		}
		// 成功の場合
		if (StringUtils.equals(RETURN_SUCCESS, resultMsg)) {
			redirectAttributes.addFlashAttribute(RDIRECT_SUCCESS_MSG_KEY, UPDATE_SUCCESS_MSG);
		}
		return REDIRECT + "/account/search";
	}
}
