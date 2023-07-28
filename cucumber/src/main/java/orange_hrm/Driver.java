package orange_hrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static WebDriver d;
	public static void WebDriver()
	{
    d=new ChromeDriver();
    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    d.get("https://opensource-demo.orangehrmlive.com");
    
	d.manage().window().maximize();
	 
}
}
