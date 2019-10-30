package Demowebshop;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowDemo {
	WebDriver p;
  @Test
  public void WindowDEMO() throws InterruptedException {
	  p = MyDriver.getDriver("CR");
	  p.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  p.get("http://retail.onlinesbi.com/retail/login.htm");
	  String P_Wid= p.getWindowHandle();
	  System.out.println("Parent Window is"+ P_Wid);
	  Thread.sleep(3000);
	  WebElement home = p.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']"));
	  home.click();
	  String C_Wid=p.getWindowHandle();
	  System.out.println("Parent Window is"+C_Wid);
	  Set<String> T_Wid= p.getWindowHandles();
	  for (String S: T_Wid)
	  {
		  	p.switchTo().window(S);
		  	System.out.println(p.getWindowHandle());
		  	
	  }
	  Thread.sleep(3000);
	  WebElement apply= p.findElement(By.xpath("//*[@id='mainMenu']/ul/li[8]/a"));
	  apply.click();
	  Thread.sleep(3000);
	  p.close();
 }
}
