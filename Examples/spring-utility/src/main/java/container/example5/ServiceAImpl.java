package container.example5;


public class ServiceAImpl implements ServiceA {

	private String param1;
	private String param2;
	private ServiceA param3;
	
	public ServiceAImpl(String param1, String param2, ServiceA param3) {
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
	}
	
	public ServiceAImpl() {
	}

	public ServiceAImpl(String param1, String param2) {
		this.param1 = param1;
		this.param2 = param2;
	}

	public void method1() {
		System.out.println("param1=" + param1);
		System.out.println("param2=" + param2);
		System.out.println("param3=" + param3);
	}
	
}
