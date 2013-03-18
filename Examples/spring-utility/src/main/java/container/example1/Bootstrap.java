package container.example1;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("container/example1/spring-config.xml");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Object s = context.getBean("tx.example1.ServiceAImpl#0");
	}
}
