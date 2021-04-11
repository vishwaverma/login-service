package com.pg.warrior.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pg.warrior.Entity.User;
import com.pg.warrior.repository.LoginRepo;

@Service
public class LoginService 
{
	@Autowired
	LoginRepo repo;

	public String login(User user) 
	{
		return null;
	}

}
