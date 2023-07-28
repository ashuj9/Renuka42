package Playwright_Scripts;

import java.nio.file.Paths;

import org.openqa.selenium.devtools.v85.headlessexperimental.model.ScreenshotParams;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Taking_screenshot {

	

	

		public static void main(String[] args) 
		{
			Playwright pw=Playwright.create();
			Browser br=pw.chromium().launch(new LaunchOptions().setHeadless(false));;
			Page pe=br.newPage();
			
			pe.navigate("https://www.amazon.in/s?i=apparel&bbn=1968123031&rh=n%3A1571271031%2Cn%3A1968024031%2Cn%3A1968120031%2Cn%3A1968123031%2Cp_85%3A10440599031%2Cp_n_feature_nineteen_browse-bin%3A11301357031%2Cp_72%3A1318476031%2Cp_n_pct-off-with-tax%3A27060456031&s=popularity-rank&dc&ds=v1%3A1Dz0g0WxOhyS2AX%2FUbtfFmEGSF0jiXqL17%2FVZr3kEQE&pf_rd_i=1968024031&pf_rd_i=1968024031&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=1908bfa6-5b55-449b-ab88-6192c09ae1d5&pf_rd_p=3beec2e8-79cb-4dcd-8b87-d4d55f2ed002&pf_rd_r=S5XA837DPGTPQV45ZT2N&pf_rd_r=TPPPW83MHQFWFFMTRY54&pf_rd_s=merchandised-search-7&pf_rd_s=merchandised-search-7&qid=1683049280&rnid=2665398031&ref=sr_nr_p_n_pct-off-with-tax_5");
			pe.screenshot(new ScreenshotOptions().setPath(	Paths.get("C:\\Users\\guggi\\OneDrive\\Desktop\\screenshhorts\\img.png")));
			//pe.screenshot(new ScreenshotOptions().setPath(	Paths.get("C:\\Playwrite ScreenShot\\Fullimg.png")).setFullPage(true));
		  //  Locator oneelescreenshot=pe.locator("\"//img[@alt=\\\"Amazon Brand - Symactive Men T-Shirt\\\"]\"))

		
		
		
		
		 }

	}


