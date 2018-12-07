import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdrivevalidations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "c:\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//*[@id=\"js-switch__option\"]/div[2]/label")).click();
		System.out.println("Before selecting multicity");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());

		/*
		 * driver.findElement(By.xpath("//*[@id='multicity']/label")).click();
		 * System.out.println("After selecting multicity");
		 * System.out.println(driver.findElement(By.xpath(
		 * "//*[@id=\"hp-widget__return\"]")).isDisplayed());
		 */
		driver.findElement(By.id("hp-widget__depart")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[4]/div/div[1]/table/tbody/tr[1]/td[5]"))
				.clear();

		driver.findElement(By.id("hp-widget__return")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[4]/div/div[2]/table/tbody/tr[2]/td[1]"))
				.clear();

	}
}
