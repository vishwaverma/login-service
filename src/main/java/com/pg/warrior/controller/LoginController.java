package com.pg.warrior.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pg.warrior.Entity.User;
import com.pg.warrior.service.LoginService;

@RestController
@RequestMapping("/")
public class LoginController 
{
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public String login(@RequestBody User user)
	{
		return loginService.login(user);
	}

}
