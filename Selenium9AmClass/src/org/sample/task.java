package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium9AmClass\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement btnNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnNewAcc.click();
		Thread.sleep(3000);
		WebElement dDnMonth = driver.findElement(By.id("month"));
		Select select =new Select (dDnMonth);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		for (int i = 6; i < size; i++) {
			if (i==7) {
			break;
			}
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			for (WebElement element :allSelectedOptions) {
			String text = element.getText();
			System.out.println(text);
			}
			}
		
		
		driver.quit();
		}
		
	}
			
		

