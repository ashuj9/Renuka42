package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_methods {

	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		d.get("https:www.google.com");
		Thread.sleep(2000);
		d.navigate().to("https://www.amazon.com");
		d.findElement(By.xpath("//*[@autocomplete='off']")).sendKeys("hi");
		d.navigate().refresh();
		Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(3000);
		System.out.println("all done");
	}

}
