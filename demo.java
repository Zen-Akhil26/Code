import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		driver.get("https://facebook.com");
	
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("akhilmanjunath");
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("akhil123");
	
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Akhil");
	driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Manjunath");	
	driver.findElement(By.xpath("//*[@label='Mobile number or email address']")).sendKeys("8904117845");	
	driver.findElement(By.xpath("//*[@id='u_0_v']")).sendKeys("mjaa1994");	
	driver.findElement(By.xpath("//*[@name='sex']")).click();
	driver.close();
	}

}
