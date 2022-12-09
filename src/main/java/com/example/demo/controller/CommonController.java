package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.example.demo.common.GlobalVariable;
import com.example.demo.model.UserDetailsImpl;
import com.example.demo.service.common.CommonService;

// ↓ ログ出力で使う
// import lombok.extern.slf4j.Slf4j;
// @Slf4j
// log.info("msg");
@Controller
@RequestMapping("/common")
public class CommonController extends GlobalVariable {

	@Autowired
	private CommonService commonService;

	@PostMapping("getSystemThema")
	@ResponseBody
	public String getSystemThema(Model model, @AuthenticationPrincipal UserDetailsImpl principal) {
		if (StringUtils.isEmpty(principal.getUserId())) {
			return null;
		}
		return commonService.getSystemThema(principal.getUserId());
	}
}
