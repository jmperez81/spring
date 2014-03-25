package container.example11;

/**
 * Class with no default constructors
 * @author Juan Manuel
 *
 */
public class RegularClass {
	public RegularClass() {};
	
	public void onClose() {
		System.out.println("Called @PreDestroy method");
	}
}
