package io.github.majortim.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.majortim.quickstart.domain.UserInfo;
import io.github.majortim.quickstart.service.UserInfoService;

@RestController
@RequestMapping("user")
public class UserController {
	private UserInfoService userInfoService;
	
	public UserController(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	@RequestMapping("verify")
	public UserInfo verifyUser(UserInfo userInfo) {
		
		return userInfoService.getUserInfo(userInfo.getUserId());
	}
}
