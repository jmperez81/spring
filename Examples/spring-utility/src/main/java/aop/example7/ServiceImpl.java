package aop.example7;


public class ServiceImpl implements Service {
	
	public void doMessage(String message) {
		System.out.println( message );	
	}

	public void notDoAnything() {
		System.out.println("I don't do anything");
	}
}
