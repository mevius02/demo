package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.common.GlobalVariable;
import com.example.demo.model.UserDetailsImpl;
import com.example.demo.model.mybatis.MUser;
import com.example.demo.service.MstUserService;

// ↓ ログ出力で使う
// import lombok.extern.slf4j.Slf4j;
// @Slf4j
// log.info("msg");
@Controller
@RequestMapping("/mst-user")
public class MstUserController extends GlobalVariable {

	@Autowired
	private MstUserService userService;

	private String[] thUserList = new String[] { "ユーザーID", "ユーザー名", "権限", "メールアドレス", "システムテーマ", "アカウント有効期限",
			"パスワード有効期限", "アカウント有効フラグ", "アカウント削除済フラグ", "追加ユーザーID", "追加日時", "更新ユーザーID", "更新日時", "削除ユーザーID", "削除日時" };

	@GetMapping("")
	public String index(Model model, @AuthenticationPrincipal UserDetailsImpl principal) {
		model.addAttribute("thUserList", thUserList);
		model.addAttribute("tdUserList", new ArrayList<MUser>());
		return "user/userSearch";
	}

	@GetMapping("search")
	public String search(Model model, @AuthenticationPrincipal UserDetailsImpl principal) {
		model.addAttribute("thUserList", thUserList);
		List<MUser> userList = userService.selectMUser();
		model.addAttribute("tdUserList", userList);
		return "user/userSearch";
	}

	@GetMapping("create")
	public String create(Model model, @AuthenticationPrincipal UserDetailsImpl principal) {
		model.addAttribute("thUserList", thUserList);
		return "user/userCreate";
	}
}
