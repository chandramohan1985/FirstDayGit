package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	WebElement txtUserId = driver.findElement(By.name("DUMMY1"));
	txtUserId.sendKeys("chandra");
	WebElement btn = driver.findElement(By.className("goahead"));
	btn.click();
	WebElement txtUserId1 = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	txtUserId1.sendKeys("chandra");
	
	WebElement txtPassword = driver.findElement(By.className("login-input-password"));
	txtPassword.sendKeys("1031985");
	
	WebElement btnLogin = driver.findElement(By.xpath("//input[@class='cta']"));
	btnLogin.click();
	
	
	
	
	
	
	
}
}
