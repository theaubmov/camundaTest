package aub.camunda.Spring252;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetOutDelagation implements JavaDelegate {

	@Autowired
	private AuthService authService;
	
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		authService.authService();
		
	}

}
