package Playwright_Scripts;



import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class logging_orangehrm {

	@Test
	public void logging()
	{
Playwright pl=Playwright.create();
		Browser b= pl.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg=b.newPage();
		pg.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Locator user=pg.locator("//input[@name='username']");
		Locator pass=pg.locator("//input[@name='password']");
		Locator login=pg.locator("//button[@type='submit']");
		
		user.type("Admin");
		pass.type("admin123");
		login.click();
		


	
	}
}
