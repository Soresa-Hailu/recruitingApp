import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Craft Soft\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("This is america");
//		driver.findElement(By.name("pass")).sendKeys("This is Oromia");
//		driver.findElement(By.linkText("Forgot Account?")).click();
//		
		driver.findElement(By.className("inputtext")).sendKeys("HelloWorld");
		
		
	}

}
