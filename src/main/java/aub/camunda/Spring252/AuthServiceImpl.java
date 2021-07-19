package aub.camunda.Spring252;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

	@Override
	public void authService() {
		System.out.println("### Auth Service");
		
	}

}
