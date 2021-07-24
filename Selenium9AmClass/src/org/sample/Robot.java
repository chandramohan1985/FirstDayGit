package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {
		// TODO Auto-generated constructor stub
	

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/webhp");
	driver.manage().window().maximize();
	
	WebElement txtSearch = driver.findElement(By.name("q"));
	txtSearch.sendKeys("VelMurugan");
	Actions actions = new Actions (driver);
	actions.doubleClick(txtSearch).perform();
	
	

	
	
	
	
	
}
}
