package renuka_repo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		By txtbox=By.xpath("//input[@id='datepicker']");
		WebElement textbox=d.findElement(txtbox);
		textbox.click();
		String t_year="July 2024";
		String t_day="17";
		while(true)
		{
		
		WebElement  p_year=d.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String txt=p_year.getText();
		System.out.println(txt);
			if(t_year.equals(txt))
			{ 
                break;
				
			}
		
			else
			{
				By next=By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
				WebElement next_button=d.findElement(next);
				
				next_button.click();
			}
		}
		List<WebElement> dates=d.findElements(By.xpath("//*[text()='17']"));
		for(WebElement date:dates)
		{
			if(date.getText().equals(t_day))
			{
				date.click();
				break;
			}
		}
		

	}

}
