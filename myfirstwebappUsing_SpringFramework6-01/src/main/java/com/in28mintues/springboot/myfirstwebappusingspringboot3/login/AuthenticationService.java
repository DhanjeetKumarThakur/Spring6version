package com.in28mintues.springboot.myfirstwebappusingspringboot3.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equals("in28mintues");
		boolean isValidPassword = password.equals("12345");
		
		return isValidPassword && isValidUsername;
	}
}
