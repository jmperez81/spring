package container.example8;

import org.springframework.stereotype.Repository;


/**
 * Class with no default constructors
 * @author Juan Manuel
 *
 */
@Repository("class2")
public class Class1Impl2 implements Class1 {

	private String param1;
	private String param2;
	private String param3;
	private Class1 param4;
	
	public Class1 getParam4() {
		return param4;
	}

	public void setParam4(Class1 param4) {
		this.param4 = param4;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public Class1Impl2() {}
	
	public Class1Impl2(String param1, String param2) {
		System.out.println("Parameterized constructor invoked");
		this.param1 = param1;
		this.param2 = param2;
	}

	public void method1(String beanName) {
		System.out.println(beanName + " // param1=" + param1);
		System.out.println(beanName + " // param2=" + param2);
		System.out.println(beanName + " // param3=" + param3);
		System.out.println(beanName + " // param4=" + param4);
	}
	
}
