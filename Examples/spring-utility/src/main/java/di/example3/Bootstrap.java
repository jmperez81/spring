package di.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) {
		
		// If ServiceA is Prototype ... When the constructor will be invoked?
		ApplicationContext context = new ClassPathXmlApplicationContext("di/example3/spring-config.xml");
		System.out.println(">>>> Application Context created");
			
		ServiceB serviceB = context.getBean(ServiceB.class);
		System.out.println("ServiceB retrieved from application context");
		
		System.out.println("doing something with serviceB");
		serviceB.doSomething();
		
		System.out.println("doing something with serviceB");
		serviceB.doSomething();
		
		// ServiceA is retrieved from context twice, for it is scoped as prototype, each time it is retrieved, a new instance is returned
		ServiceA serviceA = context.getBean(ServiceA.class);
		ServiceA serviceA2 = context.getBean(ServiceA.class);
		
		/*
		 * Without aop:scoped-proxy
		 * 
			calling constructor of ServiceAImpl
			calling constructor of ServiceBImpl
			>>>> Application Context created
			ServiceB retrieved from application context
			doing something with serviceB
			Hello world!
			doing something with serviceB
			Hello world!
			calling constructor of ServiceAImpl
			calling constructor of ServiceAImpl
		*/
		
		/*
		 * If we use aop:scoped-proxy (CGLIB required) a proxy is injected instead of a bean. Every time B is used, the scoped proxy retrieves an instance of A.
		 * 
			calling constructor of ServiceAImpl
			calling constructor of ServiceBImpl
			>>>> Application Context created
			ServiceB retrieved from application context
			doing something with serviceB
			calling constructor of ServiceAImpl
			Hello world!
			doing something with serviceB
			calling constructor of ServiceAImpl
			Hello world!
		 */
	}

}
