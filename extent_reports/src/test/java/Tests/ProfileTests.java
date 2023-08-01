package Tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ProfileTests extends BaseTests
{
	ExtentTest test2;
	ExtentTest test;
	@BeforeClass
	public void beforeClass()
	{
		test2=extentreports.createTest("profileTests");
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
		test.info(method.getName()+"fnished");
		
	}
	@Test
	public void ProfileTest_M1()
	{
		test.info("firstline");
		test.info("secondline");
		System.out.println("ProfileTest_M1");
		test.info("thirdline");
		test.info("fourthline");
	}
	@Test
	public void ProfileTest_M2()
	{
		try
		{
			Assert.assertTrue(false,"enter username failed");
			test.log(Status.PASS,"enter username passed");
			System.out.println("ProfileTest_M2");
		}
		catch(java.lang.AssertionError ex)
		{
			test.log(Status.FAIL,ex.getMessage());
		}
	}
	@Test
	public void ProfileTest_M3()
	{
		System.out.println("ProfileTest_M3");
	}

}
