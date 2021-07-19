package com.camunda.demo;

import org.springframework.stereotype.Service;

@Service
public class IServiceImpl implements IService {

	@Override
	public void takeTaxi() {
		System.out.println("### Take a taxi");	
	}

}
