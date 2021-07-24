package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class Question3 {
	

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.flipkart.com");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	btn.click();
Thread.sleep(3000);
	WebElement lnkHome = driver.findElement(By.xpath("//div[text()='Home']"));
	Actions actions = new Actions (driver);
	actions.moveToElement(lnkHome).perform();
	
	TakesScreenshot sc = (TakesScreenshot) driver;
File print = sc.getScreenshotAs(OutputType.FILE);
	System.out.println(print);
	
	File d = new File("D:\\Scan\\output.png");
	FileUtils.copyFile(print, d);
	
	
	
	
	
	
	}
}
