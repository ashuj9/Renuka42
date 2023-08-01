package Tests;

import org.testng.annotations.AfterSuite;

public class BaseTests extends DriverClass
{
	@AfterSuite
	public void as()
	{
		extentreports.flush();
	}

}
