package Demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class FramesDemo {
	WebDriver p;
  @Test
  public void f() {
	  
	  p = MyDriver.getDriver("CR");
	  p.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  p.get("");
	  p.switchTo().frame(p.findElement(By.name("iframeResult")));
	  p.findElement(By.xpath("//button[text()='Try it']")).click();
	  
	  if(ExpectedConditions.alertIsPresent()!=null)
	  {
		  Alert altr1 =p.switchTo().alert();
		  System.out.println(altr1.getText());
		  altr1.accept();
		  
//		  OR
		  
//		  Alert altr1 =p.switchTo().alert();
//		  String act=altr1.getText();
//		  String exp="Playgod";
//		  Assert.assertEquals(act, exp);
//		  altr1.accept();
		  
	  }
	 // p.switchTo().defaultContent();
	 // String A_text2=p.findElement(By.xpath(" "))
	  
	  p.close();
	  
  }
}
