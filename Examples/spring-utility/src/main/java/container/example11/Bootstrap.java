package container.example11;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 'class12' is not correctly defined in context, omits a constructor argument
 * @author Juan Manuel
 *
 */
public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("container/example11/spring-config.xml");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		// Destroy method is called only when programatically closing context (in non web applications)
		 ((ConfigurableApplicationContext)context).close();
	}
}
