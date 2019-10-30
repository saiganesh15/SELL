package Demowebshop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Methods {
	static WebDriver p;
  @Test
  
  public void MethodndLinks() {
	  p = MyDriver.getDriver("CR");
	  p.get("http://www.newtours.demoaut.com/mercurywelcome.php");
	  /*
	  WebElement dte = p.findElement(By.xpath("//b[text()='Oct 18, 2019']"));
	  String S2= dte.getText();
	  System.out.println(S2);
	  System.out.println(p.getTitle());
	  p.findElement(By.linkText("REGISTER"));
	  System.out.println(p.getCurrentUrl());
	  String S= p.getPageSource();
	  System.out.println(S);
	  
	  */
	  //links in particular website
	  List<WebElement> T_links = p.findElements(By.tagName("a"));
	  int Cnt_links = T_links.size();
	  System.out.println(Cnt_links);
	  
	  for(int i=0; i<Cnt_links; i++)
	  {
		  String Lnk_Txt = T_links.get(i).getText();
		  System.out.println(Lnk_Txt);
		  
		//  p.get
	  }
  }
} 
