package aub.camunda.Spring252;

import org.springframework.stereotype.Service;

@Service
public class IServiceImpl implements IService {

	@Override
	public void takeTaxi() {
		System.out.println("### Take a taxi");	
	}

}
