package com.mk.tracrat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.tracrat.command.Command;
import com.mk.tracrat.dao.userDao;

@Service
public class UserService {
	@Autowired
	private userDao dao;
	public String userInsert(Command cmd) {
		int count=dao.userInsert(cmd);
		if(count==0)
		return "insertion is failed";
		else
			return "insertion is success";
	}

}
