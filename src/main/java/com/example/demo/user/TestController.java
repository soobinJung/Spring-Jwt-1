package com.example.demo.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	@GetMapping(value = "/test")
	public String getList() {
		return "TEST";
	}
}
