package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDay2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.facebook.com/");
			String title = driver.getTitle();
			System.out.println(title);
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			WebElement txtUserName = driver.findElement(By.id("email"));
			txtUserName.sendKeys("chandra");
			WebElement txtPassword = driver.findElement(By.id("pass"));
			txtPassword.sendKeys("Thvya@1990");
			driver.quit();
			
}
}
			