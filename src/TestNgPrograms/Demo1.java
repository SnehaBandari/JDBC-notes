package TestNgPrograms;

import org.testng.annotations.Test;

import demo.de;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends de
{
	@Test(groups={"Bike"})
	public void C()
	{
		Reporter.log("Method C()",true);
	}
	

}
