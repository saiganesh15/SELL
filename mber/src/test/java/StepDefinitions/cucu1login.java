package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucu1login {
	WebDriver p;
	@Given("user is on FB login page")
	public void user_is_on_FB_login_page() throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
		p = new ChromeDriver();
		p.get("https://www.facebook.com");
		Thread.sleep(3000);
	
	
	}

	@When("user provides correct credentials")
	public void user_provides_correct_credentials() 
	{
		
		p.findElement(By.xpath("//input[@name='email']")).sendKeys("saiganesh15@gmail.com");
		p.findElement(By.xpath("//input[@name='pass']")).sendKeys("sai@1997");
//		p.findElement(By.xpath("//button[@name='login']")).click();
		//*[@id="u_0_a"]/div[1]/input
		//*[@id="u_0_a"]/div[2]/input
		p.close();
	}
	@When("Click on login button")
	public void click_on_login_button() {
		p.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() 
	{
	   System.out.println("Hello user homepage is displayed");
	}

	@Then("sees the title of the page is facebook")
	public void sees_tje_title_of_the_page_is_facebook() 
	{
		 System.out.println("FB");
	}

}
