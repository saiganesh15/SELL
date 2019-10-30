package Demowebshop;

import org.testng.annotations.Test;

public class GRPDemo {
  @Test(groups= {"Regression","Smoke"})
  public void ApplyLoan() 
  { 
		System.out.println("Passed RSm");

  }
  @Test(groups= {"UnitTesting","Smoke","Sanity"})
  public void PayEMI() 
  { 
		System.out.println("Passed RSmSa");

  }
  @Test(groups= {"Regression","Smoke"})
  public void PartPayment() 
  { 
		System.out.println("Passed RSm");

  }
  @Test(groups= {"Sanity","Smoke"})
  public void Precloseloan() 
  { 
		System.out.println("Passed SaSm");

  }
  @Test(groups= {"Regression","UnitTesting"})
  public void ReviseROI() 
  { 
		System.out.println("Passed R");

  }
}