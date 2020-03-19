import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Craft Soft\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://facebook.com/");
		
//		driver.findElement(By.name("username")).sendKeys("Name@craft.com");
//		driver.findElement(By.name("pw")).sendKeys("saleforcepassword");
//		driver.findElement(By.name("Login")).click();
		
//		driver.findElement(By.id("username")).sendKeys("Name@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("facebookPassword");
//		driver.findElement(By.id("Login")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("Facebook user");
		driver.findElement(By.name("pass")).sendKeys("Facebook password");
//		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.linkText("Forgot account?")).click();
		
		
//		driver.findElement(By.className("inputtext")).sendKeys("HelloWorld");
		
		
	}

}
