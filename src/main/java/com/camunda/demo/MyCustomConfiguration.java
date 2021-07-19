package com.camunda.demo;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.cfg.ProcessEnginePlugin;
import org.camunda.bpm.engine.impl.incident.IncidentHandler;
import org.camunda.bpm.spring.boot.starter.configuration.Ordering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordering.DEFAULT_ORDER + 1)
public class MyCustomConfiguration implements ProcessEnginePlugin{

	@Autowired
	private IncidentHandler incidentHandler;
	
	@Override
	public void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
		List<IncidentHandler> incidentHandlers = processEngineConfiguration.getCustomIncidentHandlers();
	    if (incidentHandlers==null) {
	        incidentHandlers= new ArrayList<>();
	        processEngineConfiguration.setCustomIncidentHandlers(incidentHandlers);
	        System.out.println("Pre Init Logger");
	    }
	    
	    incidentHandlers.add(incidentHandler);
	}

	@Override
	public void postInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
		System.out.println("postInit Logger");
		
	}

	@Override
	public void postProcessEngineBuild(ProcessEngine processEngine) {
		System.out.println("postProcessEngineBuild Logger");
		
	}

}
