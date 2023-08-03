package selenium_scripts;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_load_time {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(1,TimeUnit.MINUTES);
		
		Instant start_time=Instant.now();
		System.out.println("the starting time is"+start_time.toString());
		d.get("https:/www.google.com");
		d.manage().window().maximize();
		Instant end_time=Instant.now();
		System.out.println("end time is"+end_time);
		Duration duration=Duration.between(start_time,end_time);
		System.out.println("the duration Is"+duration.toMillis());
		
	}

}
