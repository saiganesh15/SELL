package Demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DEPDMO {
	static WebDriver wb;
  @Test(dataProvider = "dp")
  public void f(String u,String p) 
  {
	  wb=MyDriver.getDriver("CR");
	  wb.get("http://www.newtours.demoaut.com/mercurywelcome.php");
	  
	  WebElement uname=wb.findElement(By.name("userName"));
	  uname.sendKeys(u);
	  
  }
  @DataProvider
  public Object[][] dp()
  {
	  return new Object[][]
			  {
		  new Object[] { "demo","demo"},	  
		  new Object[] { "mercury","mercury"}
			  };
	  
	  
		  } 
  
  }

