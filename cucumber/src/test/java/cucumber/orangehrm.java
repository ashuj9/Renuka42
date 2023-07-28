package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import orange_hrm.Driver;
import orange_hrm.Login_page;

public class orangehrm {

	@Given("Url: {string}")
	public void url(String string) {
	    
	   Driver.WebDriver();
	}

	@Then("orangeHrm login page is opened sucessfully")
	public void orange_hrm_login_page_is_opened_sucessfully() {
	    
	}

	@Given("valid UserName {string}")
	public void valid_user_name(String string) {
	    Login_page.username_click(string);
	}

	@Then("UserName entered sucessfully")
	public void user_name_entered_sucessfully() {
	   System.out.println("UserName entered sucessfull");
	}

	@Given("valid Password {string}")
	public void valid_password(String string) {
	    Login_page.password_click(string);
	}

	@Then("Password entered sucessfully")
	public void password_entered_sucessfully() {
	    System.out.println("password entered succesfully");
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    Login_page.login_click();
	}

	@Then("dashboard page is displayed sucessfully")
	public void dashboard_page_is_displayed_sucessfully() {
	    System.out.println("dashboard opened succesfully");
	}
}
