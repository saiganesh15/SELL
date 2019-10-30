package Demowebshop;

import org.testng.annotations.Test;

public class InvocationCountDemo {
  @Test (invocationCount=5)
  public void f() {
	  System.out.println("Hi Hello");
  }
  @Test 
  public void fe() {
	  System.out.println("Hi Hello Namaste");
  }
}
