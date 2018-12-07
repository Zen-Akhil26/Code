import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchonization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//enter the url
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//implicit wait time declared globally
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//click on sign in button
		driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']")).click();
		
		//enter the email id and password
		driver.findElement(By.id("ap_email")).sendKeys("8904117845");
		Thread.sleep(1000);
	    driver.findElement(By.className("a-button-input")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("mjaa1994");
	    Thread.sleep(1000);
	    driver.findElement(By.id("signInSubmit")).click();
	    
	    //enter the desired product in search result
	  
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gtx 1050ti");
	    //click on enter button
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	    
	    //click on desired product and add it to cart
	    driver.findElement(By.xpath("//h2[contains(text(),'Zotac GeForce GTX 1050 Ti OC Edition ZT-P10510B-10')]")).click();
	    
	    
	    
	    //code to switch control from parent to child window
	    Set<String>ids=driver.getWindowHandles();
	    Iterator<String> it=ids.iterator();
	    String parentid=it.next();
	    String childid=it.next();
	    driver.switchTo().window(childid);
	    
	   
	   

	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//check whether product is added to cart message is displayed.
	  System.out.println(driver.findElement(By.xpath("//*[@id='huc-v2-order-row-confirm-text']/h1")).getText());
	  
	    Actions b =new Actions(driver);
	    b.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav-link-yourAccount\']"))).build().perform();
	  b.click(driver.findElement(By.xpath("//*[@id='nav-item-signout']/span"))).build().perform();
	  driver.close();
	  driver.switchTo().window(parentid);
	  Actions c =new Actions(driver);
	    c.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav-link-yourAccount\']"))).build().perform();
	  c.click(driver.findElement(By.xpath("//*[@id='nav-item-signout']/span"))).build().perform();
	  driver.close();
	
	
	
	}

}
