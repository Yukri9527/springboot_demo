package com.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.service.PopulationService;
@Controller
@RequestMapping("/population")
public class PopulationController {
	
	@Autowired
	private PopulationService populationService;
	
	@RequestMapping("/info/{id}")
	@ResponseBody
	public String getPopulationById(@PathVariable Integer id) {
		//localhost:8080/population/info/1
		return populationService.getPopulationById(id).toString();
	}
}


// Controller  是要使用MySpringBootApplication 带动
// 而Test 只跑一次  无法带动网页