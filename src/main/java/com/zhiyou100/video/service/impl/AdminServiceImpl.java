package com.zhiyou100.video.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.video.mapper.AdminMapper;
import com.zhiyou100.video.model.User;
import com.zhiyou100.video.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminMapper am;
	
	@Override
	public void addAdmin(User user) {
		
		am.insertAdmin(user);
	
	}

}
