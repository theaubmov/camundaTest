package com.camunda.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TakeTaxiDelagation implements JavaDelegate{

	@Autowired
	private IService iService;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		iService.takeTaxi();
		throw new IllegalArgumentException();
		

	}

}
