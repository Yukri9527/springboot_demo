package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.domain.DeptInfo;
import com.edu.domain.Population;
import com.edu.domain.PopulationInfo;
import com.edu.service.PopulationService;
@Controller
@RequestMapping("/population")
public class PopulationController {
	
	@Autowired
	private PopulationService populationService;
	
	@RequestMapping("/info/{id}")
	@ResponseBody
	public PopulationInfo getPopulationById(@PathVariable Integer id) {
		//localhost:8080/population/info/1
		return populationService.getPopulationById(id);
	}
	@RequestMapping("/all")
	@ResponseBody
	public List<PopulationInfo> getPopulationList(){
		return populationService.getPopulationList();
	}
}


// Controller  是要使用MySpringBootApplication 带动
// 而Test 只跑一次  无法带动网页