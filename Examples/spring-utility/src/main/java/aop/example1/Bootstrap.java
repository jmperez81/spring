package aop.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class Bootstrap {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/example1/spring-config.xml");
		Service service = new ServiceImpl();
//		 Service service = context.getBean(Service.class);
		
		// How many times will be displayed the track message ?  
		// Ninguna, se está creando el service fuera del contexto de spring!!!! el proxy se crea cuando se pasa por el application context
		// Si se pone bien, será 3 veces, porque el proxy NO FUNCIONA para métodos invocados DENTRO DE LA MISMA CLASE
		
		service.doMessage();
		service.doWork();
		service.doAll();
	}

}
