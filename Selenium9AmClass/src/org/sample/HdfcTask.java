package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.163982584.69828971.1625891788-1906803505.1576743399");
	driver.manage().window().maximize();
	
	
	
	 List<WebElement> findElements = driver.findElements(By.tagName("frameset"));
	driver.switchTo().frame(0);
	
	WebElement txtuser = driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input"));
    txtuser.sendKeys("98765609");	
    
    WebElement btnContinue = driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img"));
    btnContinue.click();
    
     WebElement txtPassword = driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[4]/td[2]/span/input"));
   txtPassword.sendKeys("gfADq@123");	
    
	

	
		
		
		
		
		
		
		
		
		
	}

}
