package container.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("container/example2/spring-config.xml");
		ServiceA serviceA = context.getBean(ServiceAImpl.class);
		serviceA.showLocale("a", "b");
		System.out.println(serviceA.getSystemProperties());
	}
}
