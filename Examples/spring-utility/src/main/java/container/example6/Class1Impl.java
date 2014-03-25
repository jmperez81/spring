package container.example6;


/**
 * Class with no default constructors
 * @author Juan Manuel
 *
 */
public class Class1Impl implements Class1 {

	private String param1;
	private String param2;
	
	private Class1Impl() {
		// If we don't provide a default constructor, bean cannot be declared without arg params. A private default constructor also works
		System.out.println("Default constructor invoked");
	}
	
	public Class1Impl(String param1, String param2) {
		System.out.println("Parameterized constructor invoked");
		this.param1 = param1;
		this.param2 = param2;
	}

	public void method1() {
		System.out.println("param1=" + param1);
		System.out.println("param2=" + param2);
	}
	
}
