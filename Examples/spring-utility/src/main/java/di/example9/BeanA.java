package di.example9;

public class BeanA {
	private String param1;
	private String param2;
	private String prop1;
	private BeanA prop2;
	
	
	public BeanA getProp2() {
		return prop2;
	}


	public void setProp2(BeanA prop2) {
		this.prop2 = prop2;
	}


	public String getProp1() {
		return prop1;
	}


	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}


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
