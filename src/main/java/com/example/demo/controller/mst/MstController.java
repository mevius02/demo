package com.example.demo.controller.mst;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.common.GlobalVariable;
import com.example.demo.model.UserDetailsImpl;
import com.example.demo.service.common.CommonService;

// ↓ ログ出力で使う
// import lombok.extern.slf4j.Slf4j;
// @Slf4j
// log.info("msg");
@Controller
@RequestMapping("/mst")
public class MstController extends GlobalVariable {

	@Autowired
	private CommonService commonService;

	@GetMapping("home")
	public String home(Model model, @AuthenticationPrincipal UserDetailsImpl principal, HttpSession session) {
		// マスタの切替Key
		model.addAttribute("selectMstTitle", "");
		commonService.setDropdownInModel(model, principal.getRoleCd());
		return "/mst/home";
	}
}
