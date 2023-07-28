package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_page extends Driver{
	static By login_xpath=By.xpath("//h5[text()='Login']");
    static By userName_xpath=By.xpath("//input[@name='username']");
    static By password_xpath=By.xpath("//input[@name='password']");
    static By login_btn_xpath=By.xpath("//button[text()=' Login ']");
    static By dashboard_homepage_xpath=By.xpath("//h6[text()='Dashboard']");
    
    
    
    public static WebElement login1()
    {
    	WebElement login1=d.findElement(login_xpath);
    	return login1;
    }
    public static WebElement username_web()
    {
    	WebElement userName1=d.findElement(userName_xpath);
    	return userName1;
    }
    public static WebElement password1()
    {
    	WebElement password1=d.findElement(password_xpath);
    	return password1;
    }
    public static WebElement login_btn1()
    {
    	WebElement login_btn1=d.findElement(login_btn_xpath);
    	return login_btn1;
    }
    public static WebElement home_page()
    {
    	WebElement homepage=d.findElement(dashboard_homepage_xpath);
    	return homepage;
    }
       //performing actions
    public static void username_click(String username)
    {
    	username_web().click();
    	username_web().sendKeys(username);
    }
    
    public static void password_click(String password)
    {
    	password1().click();
    	password1().sendKeys(password);
    }
    
    public static void login_click()
    {
    	login_btn1().click();
    	
    }
    
}
