package com.chinasoft.biz.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.biz.UsersBiz;
import com.chinasoft.dao.UsersMapper;
import com.chinasoft.entity.Users;
@Service
@Transactional
public class UsersBizImpl implements UsersBiz {
	@Autowired
	private UsersMapper um;
	
	
	public UsersMapper getUm() {
		return um;
	}


	public void setUm(UsersMapper um) {
		this.um = um;
	}


	@Override
	public Users login(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("github");
		return um.selectByUsersnameAndPassword(username, password);
	}

}
