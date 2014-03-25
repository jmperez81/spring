package container.example5;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("container/example5/spring-config.xml");
		ServiceA serviceA = context.getBean(ServiceAImpl.class);
		serviceA.method1();
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}
}
