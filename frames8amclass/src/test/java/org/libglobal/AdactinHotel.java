package org.libglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
	WebDriver driver;
	
public  WebDriver getDriver() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	return driver;	
	}
public void loadUrl(String url) {
	driver.get("https://adactinhotelapp.com");
    driver.manage().window().maximize();
}
public void login(String username, String password) {
    driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	WebElement btnlogin = driver.findElement(By.id("login"));
	btnlogin.click();
    } 	

public void searchHotel(String location,String hotels, String room_type,String room_nos,String date_pickin, String date_pickout,String adult_room,String child_room) {
	WebElement txtLocation = driver.findElement(By.id("location"));
	txtLocation.click();
	Select s = new Select(txtLocation);
	s.selectByValue(location);	
	txtLocation.click();
	WebElement txtHotels = driver.findElement(By.id("hotels"));
	txtHotels.click();
	Select s1 = new Select(txtHotels);
	s1.selectByValue(hotels);	
	txtHotels.click();
	WebElement txtRoomType = driver.findElement(By.id("room_type"));
	txtRoomType.click();
	Select s2 = new Select(txtRoomType);
	s2.selectByValue(room_type);	
	txtRoomType.click();
	WebElement txtRoomNos = driver.findElement(By.id("room_nos"));
	txtRoomNos.click();
	Select s3 = new Select(txtRoomNos);
	s3.selectByValue(room_nos);	
	txtRoomNos.click();
	WebElement txtCheckIn = driver.findElement(By.id("datepick_in"));
	txtCheckIn.sendKeys("date_pickin");
	WebElement txtCheckOut = driver.findElement(By.id("datepick_out"));
	txtCheckOut.sendKeys("date_pickout");
	WebElement txtAdults = driver.findElement(By.id("adult_room"));
	txtAdults.click();
	Select s4 = new Select(txtAdults);
	s4.selectByValue(adult_room);	
	txtAdults.click();
	WebElement txtChild = driver.findElement(By.id("child_room"));
	txtChild.click();
	Select s5 = new Select(txtChild);
	s5.selectByValue(child_room);	
	txtChild.click();
	WebElement btnSearch = driver.findElement(By.id("Submit"));
	btnSearch.click();
       }
public void selectHotel() {
	WebElement btnSelect = driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]"));
	btnSelect.click();
	WebElement btnContinue = driver.findElement(By.id("continue"));
	btnContinue.click();	
}
public void bookAHotel(String first_name,String last_name,String address,String cc_num,String cc_type,String cc_exp_month,String cc_exp_year,String cc_cvv)  {
	WebElement txtFirstName = driver.findElement(By.id("first_name"));
	txtFirstName.sendKeys(first_name);
	WebElement txtLastName = driver.findElement(By.id("last_name"));
	txtLastName.sendKeys(last_name);
	WebElement txtAddress = driver.findElement(By.id("address"));
	txtAddress.sendKeys(address);
	WebElement txtCard = driver.findElement(By.id("cc_num"));
	txtCard.sendKeys("cc_num");
	WebElement txtType = driver.findElement(By.id("cc_type"));
	txtType.click();
	Select s6 = new Select(txtType);
	s6.selectByValue(cc_type);	
	txtType.click();
	WebElement txtDate = driver.findElement(By.id("cc_exp_month"));
	txtDate.click();
	Select s7 = new Select(txtDate);
	s7.selectByValue(cc_exp_month);	
	txtDate.click();
	WebElement txtExDate = driver.findElement(By.id("cc_exp_year"));
	txtDate.click();
	Select s8 = new Select(txtExDate);
	s8.selectByValue(cc_exp_year);	
	txtExDate.click();
	WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
	txtcvv.sendKeys("cc_cvv");
	WebElement btnBook = driver.findElement(By.id("book_now"));
	btnBook.click();
}
public void BookingConfirm(int RowNo,int CellNo) throws InterruptedException, IOException {
	Thread.sleep(5000);
	String data=("");
	WebElement txtOrderNo = driver.findElement(By.id("order_no"));
    String attribute = txtOrderNo.getAttribute("value");
    System.out.println(attribute);
    File file = new File("C:\\Users\\Hp\\eclipse-workspace\\frames8amclass\\Findingdatas\\hotel.xlsx");
    FileInputStream stream = new FileInputStream(file);
    XSSFWorkbook workbook = new XSSFWorkbook(stream);
    XSSFSheet sheet = workbook.getSheet("Datas");
    XSSFRow row = sheet.getRow(1);
    XSSFCell cell = row.createCell(18);
    int Type = cell.getCellType();
    if (Type==1) {
    data=cell.getStringCellValue();
}
    if (Type==0) {
	if (DateUtil.isCellDateFormatted(cell)) {
	data=new SimpleDateFormat("dd-MMM-YYYY").format(cell.getDateCellValue());	
} 
		else {
      data= String.valueOf((long)cell.getNumericCellValue());   
}
}
if (data!=null) {
	cell.setCellValue(attribute);
}
FileOutputStream outputStream = new FileOutputStream(file);
workbook.write(outputStream);
System.out.println("Updated the value is Done");
}


}
	
	
	
		
		
		
		
		
		
		
		
		
		
	

	

	


