package Demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ActionsDemo {
	WebDriver p;
  @Test (enabled = false)
  public void f() throws InterruptedException {
	  p = MyDriver.getDriver("CR");
	  p.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  p.get("http://demowebshop.tricentis.com/");
	  Thread.sleep(3000);
	  WebElement trge1 = p.findElement(By.name("q"));
	  Actions act = new Actions(p);
	  //act.keyDown(trge1,Keys.ALT).sendKeys("ComPuter").keyUp(Keys.ALT).build().perform();
	  act.keyDown(trge1,Keys.CONTROL).sendKeys("ComPuTer").keyUp(Keys.ALT).build().perform();

	  //act.keyDown(trge1,Keys.SHIFT).sendKeys("Computer").keyUp(Keys.ALT).build().perform();

	  Thread.sleep(3000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	  Thread.sleep(3000);
	  p.close();
  }
  @Test (enabled = false)
  public void Hovering() throws InterruptedException {
	  p = MyDriver.getDriver("CR");
	  p.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  p.get("https://www.spicejet.com/");
	  p.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement trg2 = p.findElement(By.xpath("//a[text()='Add-Ons']"));
	  WebElement trg3 = p.findElement(By.xpath("//a[text()='MyFlexiPlan']"));
	  
	  Actions act1 = new Actions(p);
	  act1.moveToElement(trg2).build().perform();
	  Thread.sleep(3000);
	  trg3.click();
	  Thread.sleep(2500);
	  p.close();
  }
  @Test (enabled = false)
  public void FlightBooking() throws InterruptedException {
	  p = MyDriver.getDriver("CR");
	  p.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  p.get("https://www.spicejet.com/");
	  Thread.sleep(3000);
	  WebElement check=p.findElement(By.xpath("//*[@id=\\\"ctl00_mainContent_chk_friendsandfamily\\"));
	  WebElement drop=p.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]"));
	 // WebElement button=p.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button"]"));
	  
     System.out.print("The selected Checkbox is"+ check.isSelected());
     System.out.print("The selected DropDownis is"+ drop.isDisplayed());
    // System.out.print("The selected Button is"+ button.isEnabled());

	 
	  Thread.sleep(2500);
	  p.close();
  }
  @Test (enabled=false)
  public void RDClick() throws InterruptedException {
	  p = MyDriver.getDriver("CR");
	  p.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  p.get("https://www.spicejet.com/");
	//  Actions act2 = new Actions(p);
	//  WebElement dcl =p.findElement(By.name("//"));
	  Thread.sleep(2500);
	  p.close();
  }
  
  @Test (enabled=false)
  public void DDrop() throws InterruptedException {
	  p = MyDriver.getDriver("CR");
	  p.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  p.get("https://www.spicejet.com/");
	 // Actions act2 = new Actions(p);
	//  WebElement dcl =p.findElement(By.name("//"));
	  Thread.sleep(2500);
	  p.close();
  }
}
