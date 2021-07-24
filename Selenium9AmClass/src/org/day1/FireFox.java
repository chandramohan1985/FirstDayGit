package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.GreensTechnologys.com/");
String firefox = driver.getTitle();
System.out.println(firefox);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);









}
}
