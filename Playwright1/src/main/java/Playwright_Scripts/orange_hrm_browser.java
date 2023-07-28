package Playwright_Scripts;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class orange_hrm_browser {

	public static void main(String[] args) {
		Playwright pl=Playwright.create();
		Browser b= pl.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page pg=b.newPage();
		pg.navigate("https://opensource-demo.orangehrmlive.com/");
		String title=pg.title();
		System.out.println("the title is"+title);
		String url=pg.url();
		System.out.println("url is"+url);
		b.close();
		pl.close();

	}

}
