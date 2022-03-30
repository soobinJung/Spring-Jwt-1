package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserVo {

	private int id;
	private String userName;
	private String password;
	private String email;
	
}
