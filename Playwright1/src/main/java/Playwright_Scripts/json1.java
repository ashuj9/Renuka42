package Playwright_Scripts;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class json1 {

	public static void main(String[] args) {
		Playwright pl=Playwright.create();
		Browser b=pl.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext bc=b.newContext();
		Page p=b.newPage();
		p.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		p.fill("//*[@name='username']","Admin");
		p.fill("//*[@name='password']","admin123" );
		p.click("//*[@type='submit']");
		bc.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("applogin.json")));

	}

}
