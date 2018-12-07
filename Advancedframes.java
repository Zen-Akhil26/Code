package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Advancedframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int number=findFrameId(driver,By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		
		WebDriverWait w1=new WebDriverWait(driver,10);
		w1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id='recaptcha-verify-button']")));
		int number1=findFrameId(driver,By.xpath("//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
		
		
		
	}

	public static int findFrameId(WebDriver driver,By by) 
	 {
      int i;
		int a = driver.findElements(By.tagName("iframe")).size();
		for (i = 0; i < a; i++) 
		 {
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();

			if (count > 0) 
			   {
				break;
			   } 
			
			else 
			    {
                    System.out.println("loop again");
			    }
		}
		driver.switchTo().defaultContent();
		return i;

	}

}
