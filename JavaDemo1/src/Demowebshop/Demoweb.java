package Demowebshop;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demoweb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver p;
		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
		p = new ChromeDriver();
		p.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement SignLink = p.findElement(By.className("ico-login")); //Signin Link
		SignLink.click();
		WebElement Email = p.findElement(By.name("Email")); //Username
		Email.sendKeys("play@play.com");
		WebElement Pswd = p.findElement(By.name("Password")); //Password
		Pswd.sendKeys("play@123");
		WebElement login = p.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		
		String atitle = p.getTitle();
		String etitle = "Demo Web Shop. Login";
		//Assert.assertEquals(atitle, atitle);
		if(atitle.equals(etitle))
		{
			System.out.println("Passed");
		}		
		else
		{
			System.out.println("Failed");
		}
				
		login.click();
		Thread.sleep(5000);
		p.close();
		
		
	}

}
