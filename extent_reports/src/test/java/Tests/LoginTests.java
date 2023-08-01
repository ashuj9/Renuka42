package Tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginTests extends BaseTests
{
	ExtentTest test2;
	ExtentTest test;
	@BeforeClass
	public void beforeClass()
	{
		test2=extentreports.createTest("LoginTests");
	}
	@AfterClass
	public void afterClass()
	{
		
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
	public void LoginTest_M1()
	{
		test.info("firstline");
		test.info("secondline");
		System.out.println("LoginTest_M1");
		test.info("thirdline");
		test.info("fourthline");
	}
	public void LoginTest_M2()
	{
		try
		{
			Assert.assertTrue(false,"enter username failed");
			test.log(Status.PASS,"enter username passesed");
			System.out.println("LoginTest_M2");
		}
		catch(java.lang.AssertionError ex)
		{
			test.log(Status.FAIL,ex.getMessage());
		}
		
	}
	@Test
	public void LoginTest_M3()
	{
		System.out.println("LoginTest_M3");
	}
	
	
	
	
	
	
	
	
	
	

}
