import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Craft Soft\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://login.salesforce.com/");
		
//		driver.findElement(By.id("username")).sendKeys("craft.soresa@gmail.com");
//        driver.findElement(By.name("pw")).sendKeys("123456789");
//        driver.findElement(By.className("button r4 wide primary")).click();
////		driver.findElement(By.xpath("//*[@class='linktitle']")).click();
		
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("google Soresa");
        driver.findElement(By.cssSelector("#password")).sendKeys("google Hailu");
        driver.findElement(By.cssSelector("#rememberUn")).click();
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
        System.out.println(driver.findElement(By.cssSelector("#error")).getText() );
		
		
	}

}
