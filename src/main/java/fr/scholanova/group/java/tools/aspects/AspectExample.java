package fr.scholanova.group.java.tools.aspects;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class AspectExample {
	@Pointcut("execution(*read*(.))")
	public void aspectjLoadTimeWeavingExample() {
		
	}
	
	@Before("execution(* setFirstName*(.))")
	public void printTime() {
		System.out.println(System.currentTimeMillis());
	}

}
