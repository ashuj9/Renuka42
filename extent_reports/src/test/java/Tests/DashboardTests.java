package Tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 

public class DashboardTests extends BaseTests
{
	ExtentTest test2;
	ExtentTest test;
	@BeforeClass
	public void beforeclass()
	{
		test2=extentreports.createTest("DashboardTests");
		
	}
	@BeforeMethod
	public void beforeMethod(Method method)
	{
		test=test2.createNode(method.getName());
		test.info(method.getName()+"started");
		
	}
	@AfterMethod
	public void afterMethod(Method method)
	{
		test.info(method.getName()+"finished");
	}
	@Test
	public void DashboardTest_M1()
	{
		test.info("first line");
		test.info("second line");
		System.out.println("DashboardTest_M1");
		test.info("thire line");
		test.info("fourth ine");
	}
	@Test
	public void DashBoardTest_M2()
	{
		try
		{
			Assert.assertTrue(false,"enter username failed");
			test.log(Status.PASS,"entarusername passesed");
		}
		catch(java.lang.AssertionError ex)
		{
			test.log(Status.FAIL, ex.getMessage());
		}
	}
	
	@Test
	
	public void DashBoardTest_M3()
	{
		System.out.println("dashboardtest_M3");
	}


}
