package Demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDriver {

	public static WebDriver getDriver(String BrNm) {
		
		if(BrNm.equals("CR"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(BrNm.equals("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		//else if(BrNm.equals("ff"))
		//{
			//System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\gechidriver.exe");
			//return new ChromeDriver();
		//}
		else 
			return null;
		
		
		
		
		
	}

}
