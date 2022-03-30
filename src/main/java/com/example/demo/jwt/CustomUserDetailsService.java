package com.example.demo.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.UserDao;
import com.example.demo.UserVo;

import java.util.ArrayList;

	
@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDao repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserVo user = repository.findByUserName(username);
		
		PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		String encPassword = passwordEncoder.encode(user.getPassword());
		
		return new User(
				user.getUserName()
				, encPassword
				, new ArrayList<>());
	}
	
}
