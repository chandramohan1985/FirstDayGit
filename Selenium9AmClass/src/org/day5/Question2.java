package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.amazon.in");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	WebElement lnkPrime = driver.findElement(By.id("nav-link-prime"));
	Actions actions =new Actions(driver);
	actions.moveToElement(lnkPrime).perform();
	Thread.sleep(3000);
	WebElement lnkFreeFast = driver.findElement(By.id("multiasins-img-link"));
	lnkFreeFast.click();
	
	
	
	
	
	
	
}
}
