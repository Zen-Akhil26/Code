package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[2]/label")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[13]/a")).click();
		
		driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[2]/li[4]/a)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[4]/a)[2]")).click();
		driver.close();
		
	}
}

