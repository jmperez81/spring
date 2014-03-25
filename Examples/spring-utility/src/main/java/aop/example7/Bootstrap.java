package aop.example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/example7/spring-config.xml");
		Service service = (Service) context.getBean("service");
		service.doMessage("Something");
		service.notDoAnything();
	}
}
