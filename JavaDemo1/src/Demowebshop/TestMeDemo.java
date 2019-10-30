package Demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestMeDemo {
 
  WebDriver p;
  @Test
  public void f() throws InterruptedException {
	  p = MyDriver.getDriver("CR");
	  p.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  p.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  p.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	  
	  p.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span")).click();
	  p.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span")).click();
	  //p.switchTo().frame(p.findElement(By.name("")));
	  p.switchTo().frame(p.findElement(By.name("//frame[@name='main_page']")));
	  WebElement one=p.findElement(By.xpath("//address[@id='demo3']"));
	  String S=one.getText();
	  System.out.println(S);
	  
  } 
}
