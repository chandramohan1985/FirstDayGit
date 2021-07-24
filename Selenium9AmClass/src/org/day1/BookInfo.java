package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BookInfo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("http://demo.automationtesting.in/Register.html");

String title = driver.getTitle();
System.out.println(title);

String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

WebElement txtFirstName = driver.findElement(By.xpath("//input[@type='text']"));
txtFirstName.sendKeys("chandra");

WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
txtLastName.sendKeys("mohan");

WebElement btnGender = driver.findElement(By.xpath("//input[@name='radiooptions']"));
btnGender.click();
boolean selected = btnGender.isSelected();
System.out.println(selected);
Thread.sleep(4000);
WebElement btncricket = driver.findElement(By.xpath("//input[@id='checkbox1']"));
btncricket.click();



}
}
