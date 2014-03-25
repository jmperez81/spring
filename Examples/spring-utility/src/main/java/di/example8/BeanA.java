package di.example8;

public class BeanA {
	private String param1;
	private String param2;
	
	
	public String getParam1() {
		return param1;
	}


	public void setParam1(String param1) {
		this.param1 = param1;
	}


	public String getParam2() {
		return param2;
	}


	public void setParam2(String param2) {
		this.param2 = param2;
	}


	public BeanA(String param1, String param2){
		System.out.println("BeanA created");
		this.param1 = param1;
		this.param2 = param2;
	}
}
