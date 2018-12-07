import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		//invoking chrome driver
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//enter the url  of the website
		driver.get("https://radiusagent.com");
		driver.manage().window().maximize();
		
		//implicit wait time declared globally
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id='__next']/div[2]/div/div[2]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id='content-section']/div/div/div[3]/div/form/div[1]/div/input")).sendKeys("email address");
		driver.findElement(By.xpath("//*[@id=\'content-section\']/div/div/div[3]/div/form/div[2]/div/input")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='content-section']/div/div/div[3]/div/form/div[4]/button")).click();
		

	}

}
