package Mydemo.Mydemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemo1 {
  @Test
  public void f() throws IOException
  {
	  File fin = new File("C:\\Users\\Training_H2a.06.17\\Desktop\\Selenium\\ExcelDemo1.xlsx");
	  FileInputStream fis = new FileInputStream(fin);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sh = wb.getSheetAt(0);
	  int t_rws = sh.getLastRowNum();
	  System.out.println(t_rws);
	  for(int i = 0;i<=t_rws;i++)
	  {
		  String uname =sh.getRow(i).getCell(0).getStringCellValue(); //reading
		  System.out.println(uname);
		  String pwd =sh.getRow(i).getCell(1).getStringCellValue(); //reading
		  System.out.println(pwd);
		  sh.getRow(i).createCell(2).setCellValue("Valid");
		  FileOutputStream fout =new FileOutputStream(new File("C:\\Users\\Training_H2a.06.17\\Desktop\\Selenium\\ExcelDemo1.xlsx"));
		  wb.write(fout);
	  }
	wb.close();  
  }
}
