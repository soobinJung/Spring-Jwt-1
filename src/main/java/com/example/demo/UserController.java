package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	UserService service;

	@Autowired
	public UserController( UserService service ) {
		this.service = service;
	}

	@GetMapping(value = "/list")
	public List<UserVo> getList() {
		return service.getList();
	}
}
