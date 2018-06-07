package TestNgPrograms;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public  class BasicProg 
{
	@BeforeTest
	public void m1()
	{
		Reporter.log("Before Test",true);
		
	}
	
	@AfterTest
	public void m2()
	{
		Reporter.log("After Test",true);
		
	}
	
	@BeforeClass
	public void m3()
	{
		Reporter.log("Before Class",true);
	}
	
	@AfterClass
	public void m4()
	{
		Reporter.log("After Class",true);
	}
}
