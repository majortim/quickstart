package io.github.majortim.quickstart.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.github.majortim.quickstart.domain.Entertainer;
import io.github.majortim.quickstart.service.EntertainerService;
import io.github.majortim.quickstart.vo.Criteria;

@Controller
@RequestMapping("entertainers")
public class EntertainerController {
	private EntertainerService entService;
	
	public EntertainerController(EntertainerService entService) {
		this.entService = entService;
	}
	
	@GetMapping("")
	String list(@RequestParam Map<String, Object> param, Model model) {
		
		return "entertainer/list";
	}
	
	@GetMapping(value = {"type/{searchType}", "type/{searchType}/text/{searchText}"}, produces = "application/json;charset=UTF-8")
	@ResponseBody
	List<Entertainer> listAjax(Criteria criteria, @PathVariable String searchType, @PathVariable(required = false) String searchText) {
		criteria.setSearchType(searchType);
		criteria.setSearchText(searchText);
		
		return entService.getEntertainerList(criteria);
	}
}
