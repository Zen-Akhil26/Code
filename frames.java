import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//switching to frames from main program
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		//switching back to main webpage or program from frames
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id='sidebar']/aside[2]/ul/li[1]/a")).click();
		driver.close();
		
		
		
		/*Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id='navigation971447a0_3285_4370_a238_698df2bab887']/div[2]/div[1]/div[1]/div[1]/span/a"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav\']/li[1]/a/div[1]"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='nav']/li[1]/ul/li[2]/a/div[1]"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='navigation971447a0_3285_4370_a238_698df2bab887']/div[2]/div[1]/div[1]/div[2]/span/a"))).build().perform();
		Thread.sleep(2000);
	    a.contextClick(driver.findElement(By.xpath("//*[@id='navigation971447a0_3285_4370_a238_698df2bab887']/div[2]/div[1]/div[1]"))).build().perform();*/

	 
	
	}
	


}
