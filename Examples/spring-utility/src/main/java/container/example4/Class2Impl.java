package container.example4;


public class Class2Impl implements Class2 {
	private Class1 className1;
	
	public Class1 getClassName1() {
		return className1;
	}

	public void setClassName1(Class1 class1) {
		this.className1 = class1;
	}

	public String method1() {
		return "Value in class2.method1";
	}
}
