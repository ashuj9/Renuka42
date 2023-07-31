package ply_tc_fb_class;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import ply_tc_fb.driver;
import ply_tc_fb.login;

public class testcase extends driver
 {
	
	
	public void open_page()
	{
		driver.driver("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		String act_url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	assertEquals(act_url,driver.p.url(),"incorrect URL");
	System.out.println("testcase1 pass");
	}
	
	public void valid_credentials()
	{
		login.enter_email("Admin");
		String act_email="Admin";
		assertEquals(act_email,login.email().inputValue(),"invalid mailid");
		  
		login.enter_pass("admin123");
		String act_password="admins123";
		assertEquals(act_password,login.password().inputValue(),"invalid password");
		
		login.login_click();
		assertTrue(login.login_msg().isVisible(),"dashboardpage opened");
		
		
	}
	
	
	

	}
	
	
	
	
	
	
	
	
	
	


