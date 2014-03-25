package container.example10;

import org.springframework.beans.factory.FactoryBean;


/**
 * Class with no default constructors
 * @author Juan Manuel
 *
 */
public class FactoryBeanClass implements FactoryBean<EmbeddedClass> {

	private String param1;
	
	public FactoryBeanClass() {};
	
	public EmbeddedClass getObject() throws Exception {
		System.out.println("Invoked getObject()");
		EmbeddedClass resultado = new EmbeddedClass();
		resultado.setParam1("valor");
		return resultado;
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

	public void method1(String beanName) {
		System.out.println("param1 is " + param1);
	}
	
}
