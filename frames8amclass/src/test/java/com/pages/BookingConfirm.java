package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends LibGlobal {
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}
	
	
	
@FindBy(id="order_no")
private WebElement txtOrderNo;

public WebElement getTxtOrderNo() {
	return txtOrderNo;
}


public void Booking() {
getAttribute(getTxtOrderNo(), "value");

}

}
