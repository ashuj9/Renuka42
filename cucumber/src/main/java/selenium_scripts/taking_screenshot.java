package selenium_scripts;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taking_screenshot {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		//File source_file=d.
				//(OutputType.FILE);

	}

}
