package com.example.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.common.GlobalVariable;
import com.example.demo.model.UserDetailsImpl;

// ↓ ログ出力で使う
// import lombok.extern.slf4j.Slf4j;
// @Slf4j
// log.info("msg");
@Controller
@RequestMapping("/sample")
public class SampleController extends GlobalVariable {

	@GetMapping("")
	public String getHome(Model model, @AuthenticationPrincipal UserDetailsImpl principal) {
		return "sample/sampleHome";
	}
}
