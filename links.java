
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class links {

	
	  public static final String USERNAME = "akhil2016";
	  public static final String ACCESS_KEY = "b9e873fc-85db-420d-bc5b-ace0dc9409a1";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  
	  public static void main(String[] args) throws MalformedURLException  {
	
		  /*DesiredCapabilities cap = DesiredCapabilities.chrome();
		  cap.setCapability("platform", "Windows 7");
		  cap.setCapability("version", "56.0");*/
		  
		 /* DesiredCapabilities cap = DesiredCapabilities.firefox();
		  cap.setCapability("platform", "OS X 10.10");*/
		  
		  DesiredCapabilities cap = DesiredCapabilities.chrome();
		  cap.setCapability("platform", "Linux");
		  cap.setCapability("version", "42.0");
		  
		  WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),cap);

		
		driver.get("https://www.nvidia.com/en-in/");
		driver.manage().window().maximize();
		driver.quit();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limiting the webdriver scope to only footer section
		WebElement x=driver.findElement(By.xpath("//*[@id='page-content']/div/div[8]"));
		System.out.println(x.findElements(By.tagName("a")).size());
		
		//limiting the webdriver scope to only footer section first column
		WebElement y=driver.findElement(By.xpath("//*[@id='columnlayout5ee971fa_41a3_44e0_a1ed_9e574577038a']/div[1]"));
		System.out.println(y.findElements(By.tagName("a")).size());
		for(int i=1;i < y.findElements(By.tagName("a")).size(); i++)
		{
			
			String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
			y.findElements(By.tagName("a")).get(i).sendKeys(s);
			
		}
		
		
		//move to each tab and get the title
			Set<String> id=driver.getWindowHandles();
		    Iterator <String> it= id.iterator();
		    
		    while(it.hasNext())
		    {
		    	
		    	driver.switchTo().window(it.next());
		    	System.out.println(driver.getTitle());
		    	   	
		    }
		    	
		//limiting the webdriver scope to only header section
		WebElement z=driver.findElement(By.id("navigation47172270_7402_427b_84b8_79bfd59339ac"));
		System.out.println(z.findElements(By.tagName("a")).size());
		
		
	}

}
