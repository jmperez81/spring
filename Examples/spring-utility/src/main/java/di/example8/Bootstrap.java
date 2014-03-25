package di.example8;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/example8/spring-config.xml");
		
		System.out.println("Beans registered in container : " + Arrays.toString(context.getBeanDefinitionNames()));
		
		// An exception is thrown as there are two beans registered for type BeanA
		BeanA beanA = context.getBean(BeanA.class);
		
		// First constructor argument of type String
		System.out.println(beanA.getParam1());
		
		// Second constructor argument of type String
		System.out.println(beanA.getParam2());
	}
}