package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoLogin 
{
	WebDriver p;
	@Given("User is on demowebshop")
	public void user_is_on_demowebshop() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
		p = new ChromeDriver();
		p.get("http://demowebshop.tricentis.com/");
		Thread.sleep(3000);
	
	}

	@Given("Chooses tp click on login")
	public void chooses_tp_click_on_login() 
	{
		p.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/")).click();
		
		
	}

	@When("User enter email and password")
	public void user_enter_email_and_password() 
	{
		p.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("karthik456@gmail.com");
		p.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("karthik456");
	}

	@When("Clicks on login")
	public void clicks_on_login() throws InterruptedException
	{
		p.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		Thread.sleep(3000);
	}
	@Then("He sees his user homepage")
	public void he_sees_his_user_homepage() throws InterruptedException 
	{
		boolean t=p.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).isDisplayed();
		Assert.assertTrue(t);
		Thread.sleep(3000);
		p.close();
	}
		

	}


