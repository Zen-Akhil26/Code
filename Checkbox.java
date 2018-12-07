package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[2]/label/input")).isSelected());
		driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[2]/label/input")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/div[2]/label/input")).isSelected());
		

		driver.close();
	}

}
