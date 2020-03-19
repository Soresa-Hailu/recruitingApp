import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Craft Soft\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("http://spicejet.com");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("4");
//		s.selectByIndex(6);
//		s.selectByVisibleText("7 Adults");
//
//		System.out.print(driver.findElement(By.id("divpaxinfo")).getText());
//		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);
		
//		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//a[@value='KNU'])[2]")).click();
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='KNU'])")).click();

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		
	
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	

//	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));	
		
//	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
//	    {
//	    	System.out.println("It's enabled");
//	    	Assert.assertTrue(false);
//	    }
//	    
//	    else 
//	    {
//	    	Assert.assertTrue(true);	
//	    }
		
	    Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    s2.selectByValue("USD");
	    
	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	    
	    
	}

}
