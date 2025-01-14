package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticationController {

	@RequestMapping("/login")
	public String login(final Model model) {
		return "loginlogin";
	}

	@RequestMapping("/")
	public String home(final Model model) {
		return "redirect:/dashboard";
	}

	@RequestMapping("/403")
	public String error403(final Model model) {
		System.out.println(username);
		System.out.println("New comment");//コメントの追加
		return "error403";
	}
}
