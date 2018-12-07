import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.nvidia.com/Download/index.aspx");
		Select s=new Select(driver.findElement(By.id("selProductSeriesType")));
		s.selectByValue("1");
		Select s1=new Select(driver.findElement(By.id("selProductSeries")));
		s1.selectByVisibleText("GeForce 10 Series");
		Select s2=new Select(driver.findElement(By.id("selProductFamily")));
		s2.selectByIndex(5);
		Select s3=new Select(driver.findElement(By.id("selOperatingSystem")));
		s3.selectByVisibleText("Windows 10 64-bit");
		Select s4=new Select(driver.findElement(By.id("ddlLanguage")));
		s4.selectByVisibleText("English (UK)");
		
		driver.findElement(By.xpath("//*[@id='imgSearch']")).click();
		
		
		driver.close();
		
		
	}
}
