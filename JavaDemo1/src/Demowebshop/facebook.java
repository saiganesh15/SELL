package Demowebshop;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class facebook {
	static WebDriver p;
	@Test
  public void registration() {
		p = MyDriver.getDriver("CR");
		p.get("http://www.facebook.com");
		
		
		
		
		
		
  }
}
