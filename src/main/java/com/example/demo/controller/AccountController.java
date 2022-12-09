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
import com.example.demo.model.Account;
import com.example.demo.model.UserDetailsImpl;
import com.example.demo.service.AccountService;
import com.example.demo.service.MstSystemThemaService;
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
	@Autowired
	private MstSystemThemaService systemThemaService;

	private String ACCOUNT_SEARCH = "account/accountSearch";
	private String ACCOUNT_EDIT = "account/accountEdit";
	private String ACCOUNT_CHECK_EDIT = "account/accountCheckEdit";
	private String REDIRECT_ACCOUNT_SEARCH = REDIRECT + "/account/search";

	@GetMapping("search")
	public String search(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session) {
		// セッション初期化
		session.removeAttribute(KEEP_INPUT_CONTENTS_KEY);
		// ↓↓↓↓↓ [登録/更新] 成功後の処理 ↓↓↓↓↓
		String successMsg = (String) model.getAttribute(SUCCESS_MSG_KEY);
		if (!StringUtils.isEmpty(successMsg)) {
			model.addAttribute(SUCCESS_MSG_KEY, successMsg);
		}
		// ↑↑↑↑↑ [登録/更新] 成功後の処理 ↑↑↑↑↑
		AccountForm accountForm = new AccountForm();
		Account account = accountService.selectMyAccount(principal.getUserId());
		accountForm.setAccount(account);
		model.addAttribute("accountForm", accountForm);
		return ACCOUNT_SEARCH;
	}

	@GetMapping("edit")
	public String edit(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session) {
		commonService.setDropdownInModel(model);
		AccountForm accountForm = new AccountForm();
		// 確認画面から戻った場合、引継ぎセット
		Account inputContents = (Account) session.getAttribute(KEEP_INPUT_CONTENTS_KEY);
		if (inputContents != null) {
			accountForm.setAccount(inputContents);
		} else {
			accountForm.setAccount(accountService.selectMyAccount(principal.getUserId()));
		}
		model.addAttribute("accountForm", accountForm);
		return ACCOUNT_EDIT;
	}

	@PostMapping("check-edit")
	public String checkEdit(Model model, @AuthenticationPrincipal UserDetailsImpl principal,
			HttpSession session,
			@Validated @ModelAttribute AccountForm accountForm, BindingResult result) {
		commonService.setDropdownInModel(model);
		// 追加入力エラーチェック
		accountService.formErrorCheckMyAccount(principal.getUserId(), accountForm, result);
		// 入力エラー有の場合
		if (result.hasErrors()) {
			return ACCOUNT_EDIT;
		}
		// 年齢セット
		accountForm.getAccount().setAge(commonService.calcAge(accountForm.getAccount().getDateOfBirth()));
		// マスタ名セット
		accountForm.getAccount().setSystemThemaNm(
				systemThemaService.selectSystemThemaNmByPrimaryKey(accountForm.getAccount().getSystemThemaCd()));
		// セッションに入力内容保持
		session.setAttribute(KEEP_INPUT_CONTENTS_KEY, accountForm.getAccount());
		return ACCOUNT_CHECK_EDIT;
	}

	@PostMapping("confirm-edit")
	public String confirmEdit(Model model, @AuthenticationPrincipal UserDetailsImpl principal,
			HttpSession session,
			@Validated @ModelAttribute AccountForm accountForm, BindingResult result,
			RedirectAttributes redirectAttributes) {
		commonService.setDropdownInModel(model);
		// [更新] M_USER, M_USER_DETAIL
		String resultMsg = accountService.updateMyAccount(principal.getUserId(),
				(Account) session.getAttribute(KEEP_INPUT_CONTENTS_KEY));
		// 失敗の場合
		if (StringUtils.equals(RETURN_FAILURE, resultMsg)) {
			model.addAttribute(FAILURE_MSG_KEY, UPDATE_FAILURE_MSG);
			accountForm.setAccount((Account) session.getAttribute(KEEP_INPUT_CONTENTS_KEY));
			return ACCOUNT_EDIT;
		}
		// その他、エラーの場合
		if (!StringUtils.equals(RETURN_SUCCESS, resultMsg) && !StringUtils.equals(RETURN_FAILURE, resultMsg)
				&& !StringUtils.isEmpty(resultMsg)) {
			model.addAttribute(FAILURE_MSG_KEY, resultMsg);
			accountForm.setAccount((Account) session.getAttribute(KEEP_INPUT_CONTENTS_KEY));
			return ACCOUNT_EDIT;
		}
		// 成功の場合
		if (StringUtils.equals(RETURN_SUCCESS, resultMsg)) {
			redirectAttributes.addFlashAttribute(SUCCESS_MSG_KEY, UPDATE_SUCCESS_MSG);
		}
		session.removeAttribute(KEEP_INPUT_CONTENTS_KEY);
		return REDIRECT_ACCOUNT_SEARCH;
	}
}
