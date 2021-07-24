package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get(" https://www.shopclues.com/wholesale.html");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	WebElement lnkMobile = driver.findElement(By.id("nav_44"));
	Actions w =new Actions(driver);
	w.moveToElement(lnkMobile).perform();
	
	
	
	
	
	
	
}
}
