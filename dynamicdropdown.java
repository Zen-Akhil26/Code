import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.gecko.driver", "C:\\workspace\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[2]/label")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		//to select from location from dropdown
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//to select to location from dropdown
		driver.findElement(By.xpath("(//a[@value='IXZ'])[2]")).click();
		
		//to select from date from calander
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr[5]/td[4]")).click();
		
		//to select to date from calander
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_view_date2']")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[3]/a")).click();
		



	driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
	int i=0;
	while(i<8)
	{
	driver.findElement(By.xpath("//*[@id='hrefIncChd']")).click();
     i++;
	}


	Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	s.selectByIndex(1);
		
	
		driver.close();
		
		
	}

}

