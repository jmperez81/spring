package container.example10;



/**
 * Class with no default constructors
 * @author Juan Manuel
 *
 */
public class RegularClass {
	private EmbeddedClass param;
	
	public RegularClass() {};

	public RegularClass(EmbeddedClass c3) {
		this.param = c3;
	}

	public EmbeddedClass getParam() {
		return param;
	}

	public void setParam(EmbeddedClass param) {
		this.param = param;
	}

	@Override
	public String toString() {
		return "Class2 [param=" + param + "]";
	}
}
