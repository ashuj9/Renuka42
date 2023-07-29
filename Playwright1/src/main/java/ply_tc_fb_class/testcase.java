package ply_tc_fb_class;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import ply_tc_fb.driver;
import ply_tc_fb.login;

public class testcase extends driver
 {
	
	@BeforeMethod
	public void open_page()
	{
		driver.driver("https://tutorialsninja.com/demo/index.php?route=account/login");
		String act_url="https://tutorialsninja.com/demo/index.php?route=account/login";
	assertEquals(act_url,driver.p.url(),"incorrect URL");
	System.out.println("testcase1 pass");
	}
	@Test
	public void valid_credentials()
	{
		login.enter_email("jahnavisai111@gmail.com");
		String act_email="jahnavisai111@gmail.com";
		assertEquals(act_email,login.email().inputValue(),"invalid mailid");
		  
		login.enter_pass("Renu@ammu123");
		String act_password="Renu@ammu123";
		assertEquals(act_password,login.password().inputValue(),"invalid password");
		
		login.login_click();
		assertTrue(login.login_msg().isVisible(),"dashboardpage opened");
		
		
	}
	@Test
	public void empty_credentials()
	{
		login.enter_email("");
		String act_email="";
		assertEquals(login.email().inputValue(),act_email," email can't be empty");
		
		
		 login.enter_pass("");
		 String act_password="";
		 assertEquals(login.password().inputValue(),act_password,"password can't be empty");
		 
		 login.login_click();
		 assertTrue(login.empty().isVisible(),"mail and password can;t be empty");
		 
	}
	
	
	

	}
	
	
	
	
	
	
	
	
	
	


