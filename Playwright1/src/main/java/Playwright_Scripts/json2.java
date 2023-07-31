package Playwright_Scripts;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class json2 {

	public static void main(String[] args) {
		Playwright pl=Playwright.create();
		Browser b=pl.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext bc=b.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("applogin.json")));
	Page p=bc.newPage();
	p.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
