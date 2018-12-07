package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//input[@value='Male']")).isSelected());
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='Male']")).isSelected());
		driver.close();
	}

}
