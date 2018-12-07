package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='tab-hotel-tab-hp']/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='hotel-destination-hp-hotel']")).click();
		driver.findElement(By.xpath("//*[@id='hotel-destination-hp-hotel']")).sendKeys("Singapore");
		driver.findElement(By.xpath("//*[@id='hotel-checkin-hp-hotel']")).click();
		driver.findElement(By.xpath("//*[@id='hotel-checkin-wrapper-hp-hotel']/div/div/div[2]/table/tbody/tr[4]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='gcw-hotel-form-hp-hotel']/div[9]/label/button")).click();
		
		WebDriverWait d=new WebDriverWait(driver,10);
		d.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='page-interstitial']/div[4]/div/span")));
		driver.findElement(By.xpath("*[contains(@id='11')]")).click();
		
		
	}

}

