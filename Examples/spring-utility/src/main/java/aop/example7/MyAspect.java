package aop.example7;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
	  public void advice() {
	    System.out.println("Aspect called");;
	  }
}
