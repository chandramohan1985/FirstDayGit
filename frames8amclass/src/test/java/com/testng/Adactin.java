package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	WebDriver driver;
	@BeforeClass()
	private void getDriver() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
	}
	 
	@Parameters ({"username","password"})
@Test()
private void login (String s,String s1) {

	 WebElement txtUserName = driver.findElement(By.id("username"));
	   txtUserName.sendKeys(s);
	   driver.findElement(By.id("password")).sendKeys(s1);
	   driver.findElement(By.id("login")).click(); 
}
	@Parameters({"location","hotels","room_type","room_nos","datepick_in","datepick_out","adult_room","child_room"})
@Test()
private void searchHotel(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws InterruptedException {
		WebElement txtLocation = driver.findElement(By.id("location"));
		txtLocation.click();
	    Select select = new Select(txtLocation);
	    select.selectByValue(s);
	    txtLocation.click();
		WebElement txtHotels=driver.findElement(By.id("hotels"));
		txtHotels.click();
		Select select1 = new Select(txtHotels);
		select1.selectByValue(s1);
		txtHotels.click();
		WebElement txtRoomType = driver.findElement(By.id("room_type"));
		txtRoomType.click();
		Select select2 = new Select(txtRoomType);
		select2.selectByValue(s2);	
		txtRoomType.click();
		WebElement txtRoomNos = driver.findElement(By.id("room_nos"));
		txtRoomNos.click();
		Select select3 = new Select(txtRoomNos);
		select3.selectByValue(s3);	
		txtRoomNos.click();
		WebElement txtCheckIn = driver.findElement(By.id("datepick_in"));
		txtCheckIn.sendKeys(s4);
		WebElement txtCheckOut = driver.findElement(By.id("datepick_out"));
		txtCheckOut.sendKeys(s5);
		WebElement txtAdults = driver.findElement(By.id("adult_room"));
		txtAdults.click();
		Select selects4 = new Select(txtAdults);
		selects4.selectByValue(s6);	
		txtAdults.click();
		WebElement txtChild = driver.findElement(By.id("child_room"));
		txtChild.click();
		Select select5 = new Select(txtChild);
		select5.selectByValue(s7);	
		txtChild.click();
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		











}