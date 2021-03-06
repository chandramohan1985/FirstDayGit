package org.libglobal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	WebDriver driver;
	WebElement element;
	String data;
public  WebDriver getDriver() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	return driver;	
	}
public void loadUrl(String Url) {
    driver.get(Url);
}	
public void maximize() {
	driver.manage().window().maximize();
}	
public String testDataRead(int RowNo,int CellNo) throws IOException  {
	
    File file = new File("C:\\Users\\Hp\\eclipse-workspace\\frames8amclass\\Findingdatas\\hotel.xlsx");
    FileInputStream stream = new FileInputStream(file);
    XSSFWorkbook workbook = new XSSFWorkbook(stream);
    XSSFSheet sheet = workbook.getSheet("Datas");
    XSSFRow row = sheet.getRow(RowNo);
    XSSFCell cell = row.getCell(CellNo);
    int Type = cell.getCellType();
    if (Type==1) {
	data = cell.getStringCellValue();
	}


    if (Type==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
		data=new SimpleDateFormat("dd-MMM-YYYY").format(cell.getDateCellValue());	
	} 
			else {
          data= String.valueOf((long)cell.getNumericCellValue());   
	}
		}

    FileOutputStream outputStream = new FileOutputStream(file);
    workbook.write(outputStream);
    System.out.println("excell Readed Done");
    
  return data;
  }
  public  static void updateTextData(int RowNo,int CellNo) throws IOException {
	  String data=("");
	  File file = new File("C:\\Users\\Hp\\eclipse-workspace\\frames8amclass\\Findingdatas\\hotel.xlsx");
	    FileInputStream stream = new FileInputStream(file);
	    XSSFWorkbook workbook = new XSSFWorkbook(stream);
	    XSSFSheet sheet = workbook.getSheet("Datas");
	    XSSFRow row = sheet.getRow(RowNo);
	    XSSFCell cell = row.createCell(CellNo);
	   int type = cell.getCellType();
	   if (type==0) {
		  data = cell.getStringCellValue();
	}
	    if (type!=0) {
			if (DateUtil.isCellDateFormatted(cell)) {
			data = new SimpleDateFormat("dd-MMM-YYYY").format(cell.getDateCellValue());	
		} 
				else {
	         data = String.valueOf((long)cell.getNumericCellValue());	       
		}
FileOutputStream o = new FileOutputStream (file);
workbook.write(o);
}
}
  

public  void type(WebElement element,String data) {
	element.sendKeys("data");
}	
public void click(WebElement element) {
	element.click();
}	
public void closeAllWindows() {
	driver.quit();
}	
public void dragAndDrop(WebElement source,WebElement target) {
	new Actions(driver).dragAndDrop(source, target).perform();
}	
public String text(WebElement element) {
	 return element.getText();
}
public void clear(WebElement element) {
	element.clear();
}
public String getAttribute() {
	 return element.getAttribute("value");
}
public void dropDownByText(String data) {
	new Select(element).selectByVisibleText(data);
}	
public void deSelectAll() {
new Select(element).deselectAll();
}
public boolean radioBox() {
	 return element.isSelected();
}
public boolean textDisplayed() {
	return element.isDisplayed();
}
public boolean textBox() {
	return element.isEnabled();
}
public void Title() {
    driver.getTitle();
}
public boolean textEquals() {
	return element.equals(element);
}
public void toUrl(String Url) {
	driver.navigate().to("Url");
}
public void backUrl() {
	driver.navigate().back();
}
public void forwardUrl() {
	driver.navigate().forward();
}
public void refreshUrl() {
	driver.navigate().refresh();
}
public boolean textEditable() {
	return element.isEnabled();
}
public boolean checkBox() {
	 return element.isSelected();
}
public void lnkText() {
	new Actions(driver).moveToElement(element);
}
public void btnText() {
	new Actions(driver).contextClick().perform();
}
public void KeyEnterClick() throws AWTException {
	new Robot().keyPress(KeyEvent.VK_ENTER);
    new Robot().keyRelease(KeyEvent.VK_ENTER);
}
public void doubleClick() {
	new Actions(driver).doubleClick().perform();
}
public File screenShot() {
return element.getScreenshotAs(OutputType.FILE);
}
public List<WebElement> dDnAllOptionSelect() {
 return new Select(element).getOptions();
}
public void dDnSelectIndex(int data) { 
	new Select(element).selectByIndex(data);
}
public void dDnSelectValve(String location) {
	new Select(element).selectByVisibleText(data);
}
public void dDnSelectByValue() {
	// TODO Auto-generated method stub

}


	

}
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

