package Playwright_Scripts;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class maximize_Browser {

	public static void main(String[] args) {
	Dimension sc=Toolkit.getDefaultToolkit().getScreenSize();
	double wid=(int)sc.getWidth();
	double hei=(int)sc.getHeight();
	System.out.println(wid);
	System.out.println(hei);
		Playwright pl=Playwright.create();
		Browser b=pl.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	BrowserContext bc=b.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
	Page p=bc.newPage();
	p.navigate("https://www.amazon.com");

	}

}
