package orange_hrm;




public class Testcase extends Driver{
	
	public static  void test_case1_login_page() throws Exception
	   {
		   Driver.WebDriver();
		  // Validation.loginPage(Login_page.login1());
		  
	   }
	
	
	   public static  void test_case_2_valid_user_name_valid_password() throws Exception
	   {
		   
		   
		   Login_page.username_click("Admin");
		   Login_page.password_click("admin123");
		   Validation.enter_username("Admin");
		   Validation.enter_password("admin123");
		   Login_page.login_click();
		   Validation.home_page(Login_page.home_page());
		  
	   }
	 

	   
}
