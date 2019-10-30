package JavaDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gan {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//int a =10;
		//int b =20;
		//int c= a+b;
		/*
		WebDriver Gane;
		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
		Gane = new ChromeDriver();
		//Gane.get("http://www.google.com");
		Gane.navigate().to("http://www.google.com");
		Gane.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Gane.manage().window().maximize();
		Thread.sleep(3000);
		Dimension d= new Dimension(300,400);
		Gane.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p = new Point (300,400);
		Gane.manage().window().setPosition(p);
		Thread.sleep(3000);
		Gane.close();
		//IE Driver
		WebDriver Gan;
		System.setProperty("webdriver.ie.driver", "C:\\My Drivers\\IEDriverServer.exe");
		Gan = new InternetExplorerDriver();
		Gane.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		Dimension d1= new Dimension(300,400);
		Gan.manage().window().setSize(d);
		Thread.sleep(3000);
		
		Gan.close();
		//Mozilla FireFox
		//WebDri
		//System.setProperty("webdriver.gecko.driver", "C:\\My Drivers\\IEDriverServer.exe");
		
		Gane.close();
		*/
		WebDriver Gane;
		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
		Gane = new ChromeDriver();
		Gane.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		Thread.sleep(3000);
		WebElement SignLink = Gane.findElement(By.linkText("SignIn")); //Signin Link
		SignLink.click();
		WebElement Uname = Gane.findElement(By.name("userName")); //Username
		Uname.sendKeys("lalitha");
		WebElement Pswd = Gane.findElement(By.name("password")); //Password
		Pswd.sendKeys("Password123");
		WebElement login = Gane.findElement(By.name("Login"));
		login.click();
		Thread.sleep(5000);
		
		//String atitle = Gane.getTitle();
		//String etitle = "Home";
		/*
		if(atitle.equals(etitle))
		{
			System.out.println("Passed");
		}		
		else
		{
			System.out.println("Failed");
		}
		*/
		//Have to import Assert
		//Assert.assertEquals(atitle,etitle);
		
		
		
		Gane.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
