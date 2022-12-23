package com.example.demo.controller.mst;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.common.GlobalVariable;
import com.example.demo.form.mst.user.SearchConditionForm;
import com.example.demo.model.UserDetailsImpl;
import com.example.demo.model.mybatis.MUser;
import com.example.demo.service.mst.UserService;

// ↓ ログ出力で使う
// import lombok.extern.slf4j.Slf4j;
// @Slf4j
// log.info("msg");
@Controller
@RequestMapping("/mst-user")
public class UserController extends GlobalVariable {

	@Autowired
	private UserService mstUserService;

	private String[] thUserList = new String[] { "No", "ユーザーID", "ユーザー名", "アカウント有効期限", "パスワード有効期限", "アカウント有効フラグ",
			"追加ユーザーID",
			"追加日時", "更新ユーザーID", "更新日時" };

	@GetMapping("")
	public String index(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session) {
		session.setAttribute("thUserList", thUserList);
		model.addAttribute("searchConditionForm", new SearchConditionForm());
		model.addAttribute("tdUserList", new ArrayList<MUser>());
		return "mst/user/search";
	}

	@GetMapping("search")
	public String search(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session,
			@Validated @ModelAttribute SearchConditionForm searchConditionForm, BindingResult result) {
		List<MUser> userList = mstUserService.selectMUser(searchConditionForm);
		model.addAttribute("tdUserList", userList);
		return "mst/user/search";
	}

	@GetMapping("create")
	public String create(Model model, @AuthenticationPrincipal UserDetailsImpl principal) {
		model.addAttribute("thUserList", thUserList);
		return "mst/user/create";
	}
}
