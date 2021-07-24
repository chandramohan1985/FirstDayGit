package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement txtUserName = driver.findElement(By.name("email"));
	txtUserName.sendKeys("email");
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	WebElement txtPassword = driver.findElement(By.id("passContainer"));
	Robot robot1 = new Robot();
	robot1.keyPress(KeyEvent.VK_CONTROL);
	robot1.keyPress(KeyEvent.VK_V);
	robot1.keyRelease(KeyEvent.VK_V);
	robot1.keyRelease(KeyEvent.VK_CONTROL);
	
	
	
	
	
}
}
