package com.atguigu.atcrowdfunding.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.atcrowdfunding.manager.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	/**
	 * 测试方法
	 */
	@RequestMapping("/test")
	public String testController(){
		
		System.out.println("testController");
		testService.insert();
		return "success";
	}

}
