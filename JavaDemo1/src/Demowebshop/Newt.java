package Demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver p;
		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
		p = new ChromeDriver();
		p.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		Thread.sleep(3000);
		WebElement SignLink = p.findElement(By.linkText("REGISTER"));
		SignLink.click();
		
		WebElement fname = p.findElement(By.name("firstName"));
		fname.sendKeys("play");
		WebElement lname = p.findElement(By.name("lirstName"));
		lname.sendKeys("god");
		WebElement pname = p.findElement(By.name("phone"));
		pname.sendKeys("8976543213");
		WebElement ename = p.findElement(By.xpath("//input[@id='userName']"));
		ename.sendKeys("9876543219");
		WebElement adname = p.findElement(By.xpath("//input[@id='address1']"));
		adname.sendKeys("1-20-42 ,Alwal");
		WebElement citname = p.findElement(By.xpath("//input[@id='city']"));
		citname.sendKeys("Hyderabad");
		WebElement staname = p.findElement(By.xpath("//input[@id='state']"));
		staname.sendKeys("Telangana");
		WebElement posname = p.findElement(By.xpath("//input[@id='postalcode']"));
		posname.sendKeys("500015");
		
		
		
		/*WebElement fname = p.findElement(By.xpath(//));
		fname.sendKeys("play@play.com");
		WebElement Pswd = p.findElement(By.name("Password")); 
		Pswd.sendKeys("play@123");3
			*/
		WebElement Cntry=p.findElement(By.xpath("//select[@name='country']"));
	
		Select El1 = new Select(Cntry);
		El1.selectByValue("6");
	
		Thread.sleep(5000);
		Select El2 = new Select(Cntry);
		El2.selectByIndex(2);
		Thread.sleep(5000);
		Select El3 = new Select(Cntry);
		El3.selectByVisibleText("INDIA");
		p.findElement(By.xpath("//input[@id='postalcode']"));
		posname.sendKeys("500015");
		p.findElement(By.xpath("//input[@id='postalcode']"));
		posname.sendKeys("500015");
		
		
		
		Thread.sleep(5000);
		p.close();
	}

}
