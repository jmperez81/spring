package container.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("container/example4/spring-config.xml");
		Class2 c2 = context.getBean(Class2Impl.class);
		System.out.println(c2.getClassName1());
	}
}
