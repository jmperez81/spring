package container.example9;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 'class12' is not correctly defined in context, omits a constructor argument
 * @author Juan Manuel
 *
 */
public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("container/example9/spring-config.xml");
//		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
	
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	}
}
