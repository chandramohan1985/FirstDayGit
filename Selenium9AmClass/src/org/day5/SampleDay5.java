package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleDay5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/drag_drop.html");
String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

WebElement s = driver.findElement(By.id("credit2"));
WebElement d = driver.findElement(By.className("placeholder"));
Actions actions1 =new Actions (driver);
actions1.dragAndDrop(s, d).perform();

WebElement s1 = driver.findElement(By.id("fourth"));
WebElement d1 = driver.findElement(By.className("placeholder"));
Actions actions2=new Actions(driver);
actions2.dragAndDrop(s1, d1).perform();

WebElement s2 = driver.findElement(By.id("credit1"));
WebElement d2 = driver.findElement(By.className("placeholder"));
Actions actions3=new Actions(driver);
actions3.dragAndDrop(s2, d2).perform();

WebElement s3 = driver.findElement(By.id("fourth"));
WebElement d3 = driver.findElement(By.className("placeholder"));
Actions actions4=new Actions(driver);
actions4.dragAndDrop(s3, d3).perform();




}
}
