package com.camunda.demo;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

	@Override
	public void authService() {
		System.out.println("### Auth Service");
		
	}

}
