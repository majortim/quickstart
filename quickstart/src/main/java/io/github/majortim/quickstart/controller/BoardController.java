package io.github.majortim.quickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class BoardController {
	@RequestMapping("list")
	String list() {
		return "board/list";
	}
}
