package frames8amclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
	WebDriver driver;

	public void login(String username, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(username);
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(password);
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}
	public void searchHotel(int location,int hotels, int room_type,int room_nos,int date_pickin, int date_pickout,int adult_room,int child_room) {
		WebElement txtLocation = driver.findElement(By.id("location"));
		txtLocation.click();
		Select s = new Select(txtLocation);
		s.selectByIndex(location);	
		txtLocation.click();
		WebElement txtHotels = driver.findElement(By.id("hotels"));
		txtHotels.click();
		Select s1 = new Select(txtHotels);
		s1.selectByIndex(hotels);	
		txtHotels.click();
		WebElement txtRoomType = driver.findElement(By.id("room_type"));
		txtRoomType.click();
		Select s2 = new Select(txtRoomType);
		s2.selectByIndex(room_type);	
		txtRoomType.click();
		WebElement txtRoomNos = driver.findElement(By.id("room_nos"));
		txtRoomNos.click();
		Select s3 = new Select(txtRoomNos);
		s3.selectByIndex(room_nos);	
		txtRoomNos.click();
		WebElement txtCheckIn = driver.findElement(By.id("datepick_in"));
		txtCheckIn.sendKeys("date_pickin");
		WebElement txtCheckOut = driver.findElement(By.id("datepick_out"));
		txtCheckOut.sendKeys("date_pickout");
		WebElement txtAdults = driver.findElement(By.id("adult_room"));
		txtAdults.click();
		Select s4 = new Select(txtAdults);
		s4.selectByIndex(adult_room);	
		txtAdults.click();
		WebElement txtChild = driver.findElement(By.id("child_room"));
		txtChild.click();
		Select s5 = new Select(txtChild);
		s5.selectByIndex(child_room);	
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
public void bookAHotel(String first_name,String last_name,String address,long cc_num,int cc_type,int cc_exp_month,int cc_exp_year,int cc_cvv)  {
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
	s6.selectByIndex(cc_type);	
	txtType.click();
	WebElement txtDate = driver.findElement(By.id("cc_exp_month"));
	txtDate.click();
	Select s7 = new Select(txtDate);
	s7.selectByIndex(cc_exp_month);	
	txtDate.click();
	WebElement txtExDate = driver.findElement(By.id("cc_exp_year"));
	txtDate.click();
	Select s8 = new Select(txtExDate);
	s8.selectByIndex(cc_exp_year);	
	txtExDate.click();
	WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
	txtcvv.sendKeys("cc_cvv");
	WebElement btnBook = driver.findElement(By.id("book_now"));
	btnBook.click();
	
}

public void BookingConfirm() throws InterruptedException {
	Thread.sleep(5000);
	 WebElement txtOrderNo = driver.findElement(By.id("order_no"));
String attribute = txtOrderNo.getAttribute("value");
System.out.println(attribute);
}

	
}











		
	


