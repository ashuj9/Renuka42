package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class first_pro {

	public static  void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
		      // Channel can be "chrome", "msedge", "chrome-beta", "msedge-beta" or "msedge-dev".
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge"));
		      Page page = browser.newPage();
	}

}
	}
