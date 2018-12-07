import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	private static final String Butter = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "c:\\workspace\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
	 
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();

		for(int i=0;i<count;i++)
		{
			
			
			String s=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			
			if(s.equals("Butter"))
				
			{
				
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
				
				
				
			}
			
			
		}
		
		
		
	}
	
	
	
}
