package container.example10;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 'class12' is not correctly defined in context, omits a constructor argument
 * @author Juan Manuel
 *
 */
public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("container/example10/spring-config.xml");
		RegularClass i = context.getBean(RegularClass.class);
		i.getParam().method1("a");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		// This does not trigger getObject method
		FactoryBeanClass fc = context.getBean(FactoryBeanClass.class);
		EmbeddedClass ec = context.getBean(EmbeddedClass.class); 
	}
}
