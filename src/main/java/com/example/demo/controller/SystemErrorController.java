package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.common.GlobalVariable;

@Controller
@RequestMapping("/system-error")
public class SystemErrorController extends GlobalVariable {

	/**
	 * 全般的なエラー遷移(GET)
	 */
	@GetMapping("")
	public String errorGet(Model model, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute(FAILURE_MSG_KEY, "システムエラーが発生しました");
		return REDIRECT + "/login";
	}

	/**
	 * 全般的なエラー遷移(POST)
	 */
	@PostMapping("")
	public String errorPost(Model model, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute(FAILURE_MSG_KEY, "システムエラーが発生しました");
		return REDIRECT + "/login";
	}
}
