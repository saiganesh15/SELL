
 
package testmeapp.tests;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import testmeapp.utility.Drivers;

public class OnlineShoppingTest {
		WebDriver p;
		ExtentHtmlReporter htmlReporter;
	    ExtentReports extent;
	    ExtentTest logger;
	    
	    
@BeforeTest 
public void startReportBeforeTest()
{
	
    htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/CaseStudy.html");
    extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
    htmlReporter.config().setDocumentTitle("Case Study Report");
    htmlReporter.config().setReportName("Test Report");
    htmlReporter.config().setTheme(Theme.STANDARD);
    htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
}	    

@AfterMethod
public void getResultAfterMEthod(ITestResult result) throws IOException
{
	if(result.getStatus() == ITestResult.FAILURE)
	{
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
        
        TakesScreenshot snapshot =   (TakesScreenshot)p;
        File src = snapshot.getScreenshotAs(OutputType.FILE);
        String Path = System.getProperty("user.dir") +"/test-output/screens/"+result.getName()+".png";
        FileUtils.copyFile(src, new File(Path));
        logger.addScreenCaptureFromPath(Path, result.getName());
        logger.fail(result.getThrowable());
	}
	else if(result.getStatus() == ITestResult.SUCCESS) 
	{
        logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
    }
	else
	{
		logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
        logger.skip(result.getThrowable());
	}
}
@AfterTest
public void endReportAfterTest()
{
	extent.flush();
}
@Test(priority=1)
public void testRegistration() throws InterruptedException
{
	  logger = extent.createTest("TC_01", "Test Registration");
	  p = Drivers.getDriver("CR");
	  p.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  p.manage().window().maximize();
	  
	  WebElement signup =p.findElement(By.xpath("//a[@href='RegisterUser.htm']"));
	  signup.click();
	  p.findElement(By.name("userName")).sendKeys("playgod123");
	
	  
	  /*
	  WebElement neww=p.findElement(By.xpath(""));

	  neww.getText();
	  WebElement neww=p.findElement(By.xpath("//*[@id=\"err\"]"));
	  String a1 = neww.getText();
	  String e1 = "Available";
	  Assert.assertEquals(a1, e1);
	  */
	  WebElement first=p.findElement(By.name("firstName"));
	  first.sendKeys("Play");
	  Thread.sleep(3000);
	  String neww=p.findElement(By.xpath("//*[@id=\"err\"]")).getText();
	  Assert.assertEquals("Available", neww);
	  
	  WebElement last=p.findElement(By.name("lastName"));
	  last.sendKeys("god");
	  
	  WebElement pass=p.findElement(By.name("password"));
	  pass.sendKeys("playgod123");
	  
	  WebElement cpass=p.findElement(By.name("confirmPassword"));
	  cpass.sendKeys("playgod123");
	  
	  
	  
	  WebElement email=p.findElement(By.name("emailAddress"));
	  email.sendKeys("playgod@gmail.com");
	  
	  WebElement mob=p.findElement(By.name("mobileNumber"));
	  mob.sendKeys("9876543210");
	  //Thread.sleep(3000);
	  WebElement dob=p.findElement(By.xpath("//*[@id=\"dob\"]"));
	  dob.sendKeys("10/22/2000");
	  //Thread.sleep(3000);
	  WebElement add=p.findElement(By.name("address"));
	  add.sendKeys("Financial District");
	//  Thread.sleep(3000);
	 // List<WebElement> sel=p.findElement(By.name("securityQuestion"));
	  WebElement Sec=p.findElement(By.name("securityQuestion"));
		Select El1 = new Select(Sec);
		El1.selectByIndex(1);
		//Thread.sleep(3000);
	  WebElement ans=p.findElement(By.name("answer"));
	  ans.sendKeys("Blue");
	 // Thread.sleep(3000);
	  p.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	  
	  
	  
}
@Test(priority=2)
public void testLogin() throws InterruptedException
{
	logger = extent.createTest("TC_02", "Test Login");
	// p = Drivers.getDriver("CR");
	// p.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	// p.manage().window().maximize();
		Thread.sleep(3000);
		WebElement SignLink = p.findElement(By.linkText("SignIn")); //Signin Link
		SignLink.click();
		WebElement Uname = p.findElement(By.name("userName")); //Username
		Uname.sendKeys("playgod123");
		WebElement Pswd = p.findElement(By.name("password")); //Password
		Pswd.sendKeys("playgod123");
		WebElement login = p.findElement(By.name("Login"));
		login.click();
		Thread.sleep(5000);
	}
@Test(priority=3)
public void testCart() throws InterruptedException
{
	
	logger = extent.createTest("TC_03", "Test Cart");
	/*
	 WebElement trg1 = p.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
	  WebElement trg2 = p.findElement(By.xpath("//span[text()='Electronics']"));
	  WebElement trg3 = p.findElement(By.xpath("//span[text()='Head Phone']"));
	  Actions act1 = new Actions(p);
	  act1.moveToElement(trg1).build().perform();
	  act1.moveToElement(trg2).build().perform();
	  Thread.sleep(3000);
	  trg3.click();
	  Thread.sleep(2500);
	  p.close();
	 */
	
	p.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
	p.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
	Thread.sleep(2000);
	p.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
	Thread.sleep(2000);
	p.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	p.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	 WebElement s=p.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]"));
	System.out.println("Remove button"+s.isDisplayed());
	boolean s1=s.isDisplayed();
	boolean s2=true;
	Assert.assertEquals(s1, s2);
	p.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	p.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	Thread.sleep(3000);
	
	 
}
@Test(priority=4)
public void testPayment() throws InterruptedException
{
	logger = extent.createTest("TC_04", "Test Payment");
	p.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
	//p.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div/label/i")).click();
	Thread.sleep(2000);
	p.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	p.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
	p.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
	p.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	p.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
	p.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	p.findElement(By.xpath("/html/body/header/div/div/ul/b/a[1]")).click();
	
	Thread.sleep(5000);
	p.close();
	
}
//@DataProvider
//public Object[][] dp()
//{
//	  return new Object[][]
//			  {
//		  new Object[] { "lalitha"},	  
//		 
//			  };
//}
}
