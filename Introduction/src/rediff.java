import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Craft Soft\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.rediff.com");
		
        driver.findElement(By.cssSelector("a[class='signin']")).click();
        driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("Soresa Hailu");	
        driver.findElement(By.cssSelector("#password")).sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@name='proceed']")).click();
		
	}

}
