package container.example10;



/**
 * Class with no default constructors
 * @author Juan Manuel
 *
 */
public class EmbeddedClass {

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	private String param1;
	
	public EmbeddedClass() {};
	
	public void method1(String beanName) {
		System.out.println("param1 is " + param1);
	}
	
}
