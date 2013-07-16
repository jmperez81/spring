package di.example5;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("di/example5/spring-config.xml");
		
		BeanB beanB = context.getBean(BeanB.class);
		if (beanB != null && beanB.getBeanA() != null) {
			System.out.println("Bean B with A dependency has been injected");			
		} else {
			System.out.println("Bean B has not been injected");
		}
		
		System.out.println("Beans registered in container : " + Arrays.toString(context.getBeanDefinitionNames()));
		
		// Bean A is not accessible through getBean method
		BeanA beanA = context.getBean(BeanA.class);
		if (beanA != null) {
			System.out.println("beanA injected indepently successfully");
		}
		
		System.out.println("Context configuration loaded successfully");
		
	}

	
}
