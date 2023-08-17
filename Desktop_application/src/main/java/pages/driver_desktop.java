package pages;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class driver_desktop
{
	public static DesiredCapabilities cap;
	public static WindowsDriver wd;

	public static void driver_opening() throws IOException, InterruptedException
	{
		cap=new DesiredCapabilities();
		cap.setCapability("app","C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe");
	     Thread.sleep(2000);
	   Desktop d=Desktop.getDesktop();
		  File file=new File("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe");
	       d.open(file); 
	     
	       wd= new WindowsDriver(new URL("http://127.0.0.1:4723/"),cap);
	       wd.manage().window().maximize();
	       
	       
	       
	       
	       
	}
public static void main(String[] args) throws IOException,InterruptedException{
	     driver_opening();
	
}






}
