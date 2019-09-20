package com.chinasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasoft.biz.UsersBiz;
import com.chinasoft.entity.Users;

@RestController
public class UsersController {
	@Autowired
	private UsersBiz ub;

	public UsersBiz getUb() {
		return ub;
	}

	public void setUb(UsersBiz ub) {
		this.ub = ub;
	}
	@RequestMapping("/login")
	@ResponseBody
	public Users login(String username,String password) {
		System.out.println("方法运行");
		return ub.login(username, password);
	}
}
