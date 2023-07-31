package ply_tc_fb;

import com.microsoft.playwright.Locator;

public class login extends driver
{
	private static final String email="//*[@id='input-email']";
	private static final String password="//*[@name='password']";
	private static final String login="//*[@type='submit']";
	
	//validation
	private static final String after_login_msg="//div[@id='content']";;
	private static final String warning_msg="//*[@class='alert alert-danger alert-dismissible'] ";
	private static final  String empty_credentials="//*[@class='alert alert-danger alert-dismissible']";
	/////locator
	public static Locator email()
	{
		return p.locator(email);
	}
	public static Locator password()
	{
		return p.locator(password);
		
	}
	public static Locator login()
	{
		return p.locator(login);
	}
	/////validations
	public static Locator login_msg()
	{
		return p.locator(after_login_msg);
	}
	public static Locator warning_msg()
	{
		return p.locator(warning_msg);

	}
	public static Locator empty()
	{
		return p.locator(empty_credentials);
	}
	
	////actions
	public static void enter_email(String email)
	{
		email().click();
		email().type(email);
		
	}
	
	public static void enter_pass(String password)
	{
		password().click();
		password().type(password);
		
	}
	public static void login_click()
	{
		login().click();
	}
	
	
	
	
	
	

}
