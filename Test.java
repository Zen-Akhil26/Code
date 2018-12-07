package practise;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("http://qaclickacademy.com/practice.php");
				driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).click();
				driver.findElement(By.xpath("//*[@id='checkBoxOption2']")).click();
				System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption2']")).getAttribute("value"));
			    String	a=driver.findElement(By.xpath("//*[@id='checkBoxOption2']")).getAttribute("value");	
		        driver.findElement(By.xpath("//*[@id='dropdown-class-example']")).sendKeys(a);
		        driver.findElement(By.xpath("//*[@id='name']")).sendKeys(a);
		        driver.findElement(By.id("alertbtn")).click();
		        driver.switchTo().alert();
		        String b=driver.switchTo().alert().getText();
		        if(a.contains("option"))
		        {
		        	
		        	System.out.println("alert message success");
		        }
		        
		        else
		        {
		        	
		        	System.out.println("alert message fail");
		        }
	}

}
