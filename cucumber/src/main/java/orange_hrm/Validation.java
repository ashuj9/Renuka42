package orange_hrm;

import org.openqa.selenium.WebElement;



public class Validation extends Driver
{
	public static void loginPage(WebElement logo) throws Exception 
	{
		if(!(logo.isDisplayed()))
		{
			throw new Exception("login page not displayed");
		}
		else
		{
			System.out.println("login page is displayed");
		}
		
	}
	
	
	public static void enter_username(String username) throws Exception
	{
		
		if(!(username.equals(Login_page.username_web().getAttribute("value"))))		{
			throw new Exception ("username  not displayed ");
		}
		else
		{
			System.out.println("username entered succefully");
		}
	}
//	public static void enter_username(String username) throws Exception
//	{
//	Assert.assertEquals(Login_page.username_web().getAttribute("value"), username,"username  not displayed ");
//	}
	
	
	
	
		public static void enter_password(String password) throws Exception
	{
		if(!(password.equals(Login_page.password1().getAttribute("value"))))
		{
			throw new Exception("password not displayed");
		}
		else
		{
			System.out.println("password entered sucessfully");		}
	}
	

	
	
	
	
	
	public static void home_page(WebElement homepage) throws Exception
	{
		if(!(homepage.isDisplayed()))
		{
			throw new Exception("dashboard page not opened");
		}
		else
		{
			System.out.println("dashboard page opened sucessfully");
		}
	}
		
	
}
