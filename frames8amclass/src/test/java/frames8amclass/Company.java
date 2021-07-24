package frames8amclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Company {
WebDriver driver;
	@BeforeClass()
	private void beforeclass() {
		// TODO Auto-generated method stub
System.out.println("before class");
	}
	
@Parameters({"username"})	
@Test()
private void testc1(String s) {
	WebDriverManager.chromedriver().setup();
	 driver =new ChromeDriver();
	driver.get("https://adactinhotelapp.com");
	 WebElement txtUserName = driver.findElement(By.id("username"));
	   txtUserName.sendKeys(s);
	
	
	
}
	
	
	
	
	
	
	
	
}
