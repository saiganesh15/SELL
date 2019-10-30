package Demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wbdwr {
	static WebDriver p;
  @Test (enabled=false)
  public void Wait() {
	  p = MyDriver.getDriver("CR");
	  p.get("http://www.newtours.demoaut.com/mercurywelcome.php");
	  WebDriverWait wt1 = new WebDriverWait(p,60);
	  wt1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("Playgod")));
	    }



@Test 
public void Wai1t() {
	  p = MyDriver.getDriver("CR");
	  p.get("http://www.newtours.demoaut.com/mercurywelcome.php");
	  WebDriverWait wt1 = new WebDriverWait(p,60);
	  wt1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("Playgod")));
	    }
}

