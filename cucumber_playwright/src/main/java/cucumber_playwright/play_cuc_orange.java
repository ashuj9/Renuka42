package cucumber_playwright;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ply_tc_fb.driver;
import ply_tc_fb.login;

public class play_cuc_orange {

	@Given("Url: {string}")
	public void url(String string) {
	      driver.driver(string);
	}

	@Then("orangeHrm login page is opened sucessfully")
	public void orange_hrm_login_page_is_opened_sucessfully() {
	    System.out.println("orangeHrm login page is opened sucessfully");
	}

	@Given("valid UserName {string}")
	public void valid_user_name(String string) {
	  login.enter_email(string);
	}

	@Then("UserName entered sucessfully")
	public void user_name_entered_sucessfully() {
	   System.out.println("UserName entered sucessfully");
	}

	@Given("valid Password {string}")
	public void valid_password(String string) {
	   login.enter_pass(string);
	}

	@Then("Password entered sucessfully")
	public void password_entered_sucessfully() {
	   System.out.println("Password entered sucessfully");
	}

	@Then("click on login button")
	public void click_on_login_button() {
	   login.login_click();
	}

	@Then("dashboard page is displayed sucessfully")
	public void dashboard_page_is_displayed_sucessfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("dashboard is opened successfully");
	}







}
