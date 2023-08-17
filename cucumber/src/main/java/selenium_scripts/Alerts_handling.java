package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_handling {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		d.manage().window().maximize();
		//alert
		d.findElement(By.xpath("(//*[text()='Click me'])[1]")).click();
		
		//System.out.println(d.findElement(By.xpath("//*[text()='You selected alert popup']")));
		//confirm box
		//prompt box

	}

}
