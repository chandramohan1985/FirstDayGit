package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.redbus.in/ ");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	WebElement txtFrom = driver.findElement(By.id("src"));
	txtFrom.sendKeys("chennai");
	WebElement txtTo = driver.findElement(By.id("dest"));
	txtTo.sendKeys("pondy");
	
	WebElement txtWord = driver.findElement(By.className("text_hero"));
	String attribute = txtWord.getAttribute("value");
	System.out.println(attribute);
	driver.quit();
}
}
