import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Craft Soft\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.makemytrip.com");
			
		
		
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluruu");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluruu");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		
		
		
		
	}

}
