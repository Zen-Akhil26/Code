import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sample {

	 public static final String USERNAME = "akhil2016";
	  public static final String ACCESS_KEY = "b9e873fc-85db-420d-bc5b-ace0dc9409a1";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		  
		
		  DesiredCapabilities cap = DesiredCapabilities.chrome();
		  cap.setCapability("platform", "Windows 7");
		  cap.setCapability("version", "56.0");
		  WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),cap);
		  
		  
		  driver.get("https://www.google.com");
		for (int x = 1; x <= 5; x++) {
			 for (int y = 1; y <= x; y++) {
			 System.out.print("* ");
			 }
			 System.out.println();
			 driver.quit();
	}
	}
}

