package org.sample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleTask {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement btnNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	btnNewAcc.click();
 
	Thread.sleep(3000);
WebElement dDnMonth1 = driver.findElement(By.id("month"));
Select select =new Select (dDnMonth1);
List<WebElement> options = select.getOptions();
int size = options.size();
for (int i = 1; i < size; i++) {
	if (i==6) {	
		break;
	}
	select.selectByIndex(i);
	List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	for (WebElement S:allSelectedOptions) {
	String text = S.getText();
	System.out.println(text);
	}
		
	}
driver.quit();
	
}
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


