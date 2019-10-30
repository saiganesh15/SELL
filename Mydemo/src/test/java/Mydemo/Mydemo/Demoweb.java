package Mydemo.Mydemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demoweb {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		File fin = new File("C:\\Users\\Training_H2a.06.17\\Desktop\\Selenium\\ExcelDemo2.xlsx");
		  FileInputStream fis = new FileInputStream(fin);
		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  XSSFSheet sh = wb.getSheetAt(0);
		  int t_rws = sh.getLastRowNum();
		  System.out.println(t_rws);
		  WebDriver p;
			System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver.exe");
			p = new ChromeDriver();
			p.get("http://demowebshop.tricentis.com/");
			Thread.sleep(3000);
		  for (int i=0;i<t_rws;i++)
		  {
		
		WebElement reg = p.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")); //Signin Link
		reg.click();
		String gen =sh.getRow(i).getCell(3).getStringCellValue();
		if (gen.equals("male"))
		{
			Thread.sleep(2000);
			p.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		}
		else 
			p.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		
		//*[@id="LastName"]
		String fname =sh.getRow(i).getCell(0).getStringCellValue();
		p.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(fname);
		String lname =sh.getRow(i).getCell(1).getStringCellValue();
		p.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(lname);
		String email =sh.getRow(i).getCell(2).getStringCellValue();
		p.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		
		String pass =sh.getRow(i).getCell(4).getStringCellValue();
		p.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
		String cpass =sh.getRow(i).getCell(5).getStringCellValue();
		p.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys(cpass);
		
		p.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		
		p.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		p.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//		p.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
//		// /html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a
		// /html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input
		Thread.sleep(1000);
		
	
	}
	
	}
}

