package Playwright_Scripts;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

public class ScreenShot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Playwright pw=Playwright.create();
		Browser br=pw.chromium().launch(new LaunchOptions().setHeadless(false));
		Page p=br.newPage();
		
		p.navigate("https:\\www.google.com");
		p.screenshot(new ScreenshotOptions().setPath(Paths.get("C:\\Users\\guggi\\OneDrive\\Desktop\\screenshhorts\\img.png")));
		p.screenshot(new ScreenshotOptions().setPath(	Paths.get("C:\\Users\\guggi\\OneDrive\\Desktop\\screenshhorts\\img2.png")).setFullPage(true));
		p.locator("//textarea[@id='APjFqb']").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("C:\\Users\\guggi\\OneDrive\\Desktop\\screenshhorts\\element.png")));
}
}