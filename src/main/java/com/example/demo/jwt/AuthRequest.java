package com.example.demo.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 인증에 필요한 정보를 담는 객체
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {
	
	private String userName;
	private String password;
	
}
