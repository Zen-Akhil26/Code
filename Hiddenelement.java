package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("Beng");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTNATION AIPORT"))
		{
			i++;
			driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		    text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10)
			{
				break;
			}
		}
		if (i>10)
		{
			System.out.println("Element not found");
		}
		else
		{
			
			System.out.println("Element  found");
		}
	}

}
