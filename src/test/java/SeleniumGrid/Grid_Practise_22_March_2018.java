package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_Practise_22_March_2018 {
	
	WebDriver driver;
	
	@Test
	public void Grid() throws MalformedURLException
	{
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	driver=new RemoteWebDriver(new URL(" http://9.76.0.189:4444/wd/hub/"), cap);
	
	driver.manage().window().maximize();
	String URL="http://www.google.com";
	driver.get(URL);
	String GoogleTitle=driver.getTitle();
	System.out.println(GoogleTitle);
	
		
	}
	
	
	

}
