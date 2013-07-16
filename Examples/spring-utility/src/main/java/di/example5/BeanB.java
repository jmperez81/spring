package di.example5;

public class BeanB {

	public BeanB(BeanA beanA){
		System.out.println("BeanB created");
	}
	
	private BeanA beanA;

	public BeanA getBeanA() {
		return beanA;
	}
	
}
