package container.example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 'class12' is not correctly defined in context, omits a constructor argument
 * @author Juan Manuel
 *
 */
public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("container/example7/spring-config.xml");
		
		Class1 c1 = context.getBean("class11", Class1Impl.class);
//		Class1 c2 = context.getBean("class12", Class1Impl.class);
		Class1 c3 = context.getBean("class13", Class1Impl.class);
		Class1 c4 = context.getBean("class14", Class1Impl.class);
		
		c1.method1("class11");		
//		c2.method1("class12");
		c3.method1("class13");
		c3.method1("class14");
	}
}
