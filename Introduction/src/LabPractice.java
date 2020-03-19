import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Craft Soft\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.findElement(By.id("name")).sendKeys("Soresa Hailu");
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
        Thread.sleep(20000);
        
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
		
		
	}

}
