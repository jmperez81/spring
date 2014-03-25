package container.example6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("container/example6/spring-config.xml");
		
		Class1 c2 = context.getBean("class12", Class1Impl.class);
		// An exception will raise because Class1 does not have default constructor
		Class1 c1 = context.getBean("class11", Class1Impl.class);
		
		c2.method1();
		c1.method1();		
	}
}
