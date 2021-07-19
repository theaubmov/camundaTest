package aub.camunda.Spring252;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.camunda.bpm.engine.delegate.DelegateExecution;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class Spring252ApplicationTests {
	
	@Test
	public void TestSomething() {

		DelegateExecution execution = Mockito.mock(DelegateExecution.class);
	}


}
