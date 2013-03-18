package di.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceBImpl implements ServiceB {
	
	// If we remove the static modifier, then the object ServiceA is injected by Spring, overriding the instance created manually
	
	@Autowired
	private static ServiceA serviceA = new ServiceA() { 
			public void doMessage() {
				System.out.println("Default Message");
			}
		};

	public void doSomething() {
		serviceA.doMessage();
	}

	
}
