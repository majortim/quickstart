package io.github.majortim.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {


	@RequestMapping("verifyUser")
	public String verifyUser() {
		return "";
	}
}
