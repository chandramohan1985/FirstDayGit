package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartInfo {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" http://www.greenstechnologys.com/");
	String gt = driver.getTitle();
	System.out.println(gt);
	String currentUrl2 = driver.getCurrentUrl();
	System.out.println(currentUrl2);
	
	WebElement txtPara = driver.findElement(By.xpath("//strong[contains(text(),'Greens Technology')]"));
	 String text = txtPara.getText();
System.out.println(text);

WebElement txtLine = driver.findElement(By.xpath("//strong[contains(text(),'we undertake')]"));
String line = txtLine.getText();
System.out.println(line);


}
}

