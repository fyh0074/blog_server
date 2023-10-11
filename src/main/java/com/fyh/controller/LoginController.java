package com.fyh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		System.out.println("login");
		return "login";
	}
}
