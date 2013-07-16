package di.example6;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:di/example6/spring-config-root.xml");
		
		System.out.println("Beans registered in container : " + Arrays.toString(context.getBeanDefinitionNames()));
	}
}