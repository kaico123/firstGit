package com.itheima.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
@RequestMapping("/jsp")
@Controller
public class JspController {
	
	@RequestMapping("/test/{id}")  //注意{}里面没有""
	//@PathVariable  获取路径的参数
	public String jspTest(@PathVariable Integer id,Model model){
		System.out.println(id);
		model.addAttribute("msg", "吹牛逼");
		return "test";
	}
}
