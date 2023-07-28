package renuka_repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_act {

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
       d.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(d);
		
		act.moveToElement(d.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/a"))).perform();
		
		
	
		
	}

}

