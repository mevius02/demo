package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.example.demo.login.UserDetailsImpl;
import com.example.demo.service.common.CommonService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/common")
public class CommonController {

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
