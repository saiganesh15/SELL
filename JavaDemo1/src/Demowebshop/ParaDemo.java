package Demowebshop;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaDemo {
  @Test
  @Parameters({"Location","Designer"})
  public void f(String Location, String Designer)
{
	  System.out.println("Test case for Login");
	  System.out.println(Location);
	  System.out.println(Designer);
  }
  @Test
  @Parameters({"Location","Designer"})
  public void g(String Location, String Designer)
{
	  System.out.println("Test case for SignUp");
	  System.out.println(Location);
	  System.out.println(Designer);
  }
  
}
