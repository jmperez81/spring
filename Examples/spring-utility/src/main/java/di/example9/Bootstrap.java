package di.example9;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/example9/spring-config.xml");
		
		System.out.println("Beans registered in container : " + Arrays.toString(context.getBeanDefinitionNames()));
		
		// An exception is thrown as there are two beans registered for type BeanA
		BeanA beanA = context.getBean("bean1", BeanA.class);
		
		// First constructor argument of type String
		System.out.println(beanA.getParam1());
		
		// Second constructor argument of type String
		System.out.println(beanA.getParam2());
		
		// Property 1
		System.out.println(beanA.getProp1());
		
		// Property 2
		System.out.println(beanA.getProp2().getParam1());
		System.out.println(beanA.getProp2().getParam2());
	}
}