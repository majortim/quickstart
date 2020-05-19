package io.github.majortim.quickstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.majortim.quickstart.service.UserInfoService;

@Controller
public class HomeController {
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/")
	public String home() {
		userInfoService.getUserInfoList();
		
		return "redirect:/board/list";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
