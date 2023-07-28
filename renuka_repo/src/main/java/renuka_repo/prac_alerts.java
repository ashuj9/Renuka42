package renuka_repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac_alerts {
  public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	By alert_click_xpath=By.xpath("(//button[text()='Click me'])[1]");
	WebElement alert_click=d.findElement(alert_click_xpath);
	alert_click.click();
	System.out.println(d.switchTo().alert().getText());
	d.switchTo().alert().accept();
	
	}
}
