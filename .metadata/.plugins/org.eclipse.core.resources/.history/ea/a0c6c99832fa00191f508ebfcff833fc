package CaseStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CS1
{
	WebDriver p;
	@Given("User is on demowebshop")
	public void user_is_on_demowebshop() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
		p = new ChromeDriver();
		p.get("http://demowebshop.tricentis.com/");
	}

	@Given("Chooses to click on register")
	public void chooses_to_click_on_register() 
	{
		p.findElement(By.xpath("//a[@href='/register']")).click();
	}

	@When("User enters the details {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enters_the_details_and_and_and_and_and(String gender, String fname, String lname, String email, String password, String cpassword) throws InterruptedException 
	{
		if (gender.equals("male"))
		{
			Thread.sleep(2000);
			p.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		}
		else 
			p.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		
		
		
		p.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(fname);
		
		p.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lname);
	
		p.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		
		
		p.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);
		
		p.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys(cpassword);
		
		Thread.sleep(2000);
		
	}

	@When("Clicks on register")
	public void clicks_on_register() throws InterruptedException 
	{
		p.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		Thread.sleep(3000);
	}

	@Then("He see his user homepage")
	public void he_see_his_user_homepage() throws InterruptedException 
	{
		p.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		// s=p.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		Thread.sleep(3000);
		p.close();
	}

}
