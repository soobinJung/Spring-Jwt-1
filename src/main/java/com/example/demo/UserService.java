package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	UserDao dao;
	
	@Autowired
	public UserService( UserDao dao ) {
		this.dao = dao;
	}
	
	List<UserVo> getList() {
		return dao.getList();
	}
}
