package TestNgPrograms;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class  Demo extends BasicProg
{
	@Test(groups={"car","Bike"})
	public void A()
	{
		Reporter.log("Method A()",true);
	}
	
	@Test(groups={"car"})
	public void B()
	{
		Reporter.log("Method B()",true);
	}
	

}
