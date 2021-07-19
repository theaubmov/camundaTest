package aub.camunda.Spring252;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.impl.incident.IncidentContext;
import org.camunda.bpm.engine.impl.incident.IncidentHandler;
import org.camunda.bpm.engine.runtime.Incident;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomIncidentHandler implements IncidentHandler{

	@Override
	public String getIncidentHandlerType() {
		return Incident.FAILED_JOB_HANDLER_TYPE;
	}

	@Autowired
	private RuntimeService runtime;
	
	@Autowired
	private IService iService;

	@Override
	public Incident handleIncident(IncidentContext context, String message) {
		
		System.out.println("handleIncident");
		iService.takeTaxi();
		
		String businessKey = "demo";
		ProcessInstance processInstance = runtime.createProcessInstanceQuery().processInstanceBusinessKey(businessKey).singleResult();

		runtime.createProcessInstanceModification(processInstance.getId())
			.cancelAllForActivity("Activity_1w6jrvr")
			.startBeforeActivity("Activity_085rx2o")
			.execute();
		
		return null;
	}

	@Override
	public void resolveIncident(IncidentContext context) {
		System.out.println("resolveIncident");
	}

	@Override
	public void deleteIncident(IncidentContext context) {
		System.out.println("deleteIncident");
	}

}
