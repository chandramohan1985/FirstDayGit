package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
 public static WebDriver driver;
	public void send(WebElement element,String data) {
	element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	public void selectValue(WebElement element,String data) {
		new Select(element).selectByValue(data);
	}
	public void selectIndex(WebElement element,int index) {
	new Select(element).selectByIndex(index);	
	}
    public String getAttribute(WebElement element,String data) {
     return element.getAttribute(data);
}
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}
    
    public void getUrl(String Url) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get(Url);
}
    public void maximize() {
		driver.manage().window().maximize();

	}
	
	}
    
    
    
    
    
