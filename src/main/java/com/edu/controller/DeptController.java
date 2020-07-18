package com.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.service.DeptService;
@Controller
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/info/{id}")
	@ResponseBody
	public String getDeptById(@PathVariable Integer id) {
		//localhost:8080/dept/info/10
		return deptService.getDeptById(id).toString();
	}
}
