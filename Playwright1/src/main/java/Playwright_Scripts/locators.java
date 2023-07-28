package Playwright_Scripts;



import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class locators {

	public static void main(String[] args) {
		Playwright p=Playwright.create();
		Browser b=p.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		//locators
		BrowserContext bc=b.newContext();
		Page pg=bc.newPage();
		pg.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//for one element
		Locator cs=pg.locator("(//*[text()='Contact Sales'])[2]");
		
	     cs.click();

	}

}
