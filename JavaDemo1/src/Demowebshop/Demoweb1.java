package Demowebshop;

import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class Demoweb1 {
  
	static WebDriver p;
	@Test
  public void f() {
		//MyDriver is Class Name of the WebDriver is present
		p = MyDriver.getDriver("CR");
		p.get("http://www.google.com");
		
		//Assert.assertEquals(arg0, arg1);
		
	
	
	}
	 
}
