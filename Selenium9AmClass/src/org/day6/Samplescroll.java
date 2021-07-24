package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplescroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.myntra.com/");
driver.manage().window().maximize();
JavascriptExecutor j = (JavascriptExecutor)driver;
WebElement a = driver.findElement(By.xpath("//*[@id=\"web-footerMount\"]/div/footer/div/div[1]/div[1]/a[7]"));
j.executeScript("arguments[0].ScrollIntoView(true)", a);

		
		
		
		
		
	
		
		
		
	}

}
