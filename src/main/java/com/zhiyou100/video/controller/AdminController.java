package com.zhiyou100.video.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.video.model.User;
import com.zhiyou100.video.service.AdminService;

@Controller
public class AdminController {

	
	@Autowired
	AdminService as;
	
	@RequestMapping("add.action")
	public String addAnmin(User user){
		
		as.addAdmin(user);
		
		return "redirect:/list";
		
	}
}
