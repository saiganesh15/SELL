package CaseStudy2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CS2 
{
	WebDriver p;
	@Given("User is on DemoWeb Homepage")
	public void user_is_on_DemoWeb_Homepage() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
		p = new ChromeDriver();
		p.get("http://demowebshop.tricentis.com/");
	}

	@Given("Choose to Click on login link")
	public void choose_to_Click_on_login_link() 
	{
		p.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	@When("User enters the details {string} and {string}")
	public void user_enters_the_details_and(String user, String pass) 
	{
		p.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(user);
		p.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() throws InterruptedException 
	{
		p.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		Thread.sleep(3000);
	}
	@Then("He sees his user homepage")
	public void He_sees_his_user_homepage() 
	{
	    boolean t=p.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).isDisplayed();
	    Assert.assertTrue(t);
	    p.close();
	}
}
