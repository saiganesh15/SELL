package Mydemo.Mydemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ShareCreationDemo {
  @Test
  public void f() throws IOException 
  {
	  XSSFWorkbook wb=new XSSFWorkbook();
	  FileOutputStream fout =new FileOutputStream(new File("Ganesh.xlsx"));
      wb.write(fout);
	  wb.close();
  }
}
