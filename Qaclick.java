package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qaclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("Ind");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys(Keys.DOWN);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		int i=0;
		while(!text.equalsIgnoreCase("India"))
		{
			i++;
			driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>5)
			{
				
				break;
			}
		}
		if(i>5)
		{
			System.out.println("element not found");
		}
		else
		{
			
			System.out.println("element  found");
		}
		driver.close();
	}

}
