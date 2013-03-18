package aop.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/example4/spring-config.xml");
		ServiceImpl service = context.getBean(ServiceImpl.class);	// Siempre obtener las cosas orientados al interfaz, ya que lo que ha metido en el application context no es un ServiceImpl sino un proxy
		
		// Service service = context.getBean(ServiceImpl.class);		// El proxy Implementa el interfaz pero NO es un ServiceImpl
		// Service service = context.getBean(Service.class);			// Correcto
	
		service.doAll();
	
	}

}
