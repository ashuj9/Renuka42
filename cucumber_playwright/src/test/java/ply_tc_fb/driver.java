package ply_tc_fb;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class driver
{
	public static Page p;
	public static void driver(String url)
	{
		Playwright pl=Playwright.create();
		Browser b=pl.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		p=b.newPage();
		p.navigate(url);
	}

}
