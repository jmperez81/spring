package container.example5;


public class ServiceAImpl implements ServiceA {

	private String param1;
	private String param2;
	
	public ServiceAImpl(String param1, String param2) {
		this.param1 = param1;
		this.param2 = param2;
	}

	public void method1() {
		System.out.println("param1=" + param1);
		System.out.println("param2=" + param2);
	}
	
}
