package org.day6;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/webhp");
	driver.manage().window().maximize();
	
	WebElement txtSearch = driver.findElement(By.name("q"));
	txtSearch.sendKeys("VelMurugan");
	Actions actions = new Actions (driver);
	actions.doubleClick(txtSearch).perform();
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_X);
	robot.keyRelease(KeyEvent.VK_X);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	
	
	
	
	
	
	
	
	
	
}
}
