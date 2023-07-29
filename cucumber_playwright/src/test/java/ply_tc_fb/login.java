package ply_tc_fb;

import com.microsoft.playwright.Locator;

public class login extends driver
{
	private static final String email="(//*[@class='oxd-input oxd-input--active'])[1]";
	private static final String password="//*[@type='password']";
	private static final String login="//*[@type='submit']";
	
	//validation
	private static final String after_login_msg="//*[@class='oxd-topbar-header-title']";
	private static final String warning_msg=" //*[@class='oxd-text oxd-text--p oxd-alert-content-text']";
	private static final  String empty_credentials="//*[@class='oxd-text oxd-text--p oxd-alert-content-text']";
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
