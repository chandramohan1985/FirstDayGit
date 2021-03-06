package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends LibGlobal {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(id="first_name")
private WebElement txtFirstName;
@FindBy(id="last_name")
private WebElement txtLastName;
@FindBy(id="address")
private WebElement txtAddress;
@FindBy(id="cc_num")
private WebElement txtCard;
@FindBy(id="cc_type")
private WebElement txtType;
@FindBy(id="cc_exp_month")
private WebElement txtDate;
@FindBy(id="cc_exp_year")
private WebElement txtExpDate;
@FindBy(id="cc_cvv")
private WebElement txtCvv;
@FindBy(id="book_now")
private WebElement btnBook;
public WebElement getTxtFirstName() {
	return txtFirstName;
}
public WebElement getTxtLastName() {
	return txtLastName;
}
public WebElement getTxtAddress() {
	return txtAddress;
}
public WebElement getTxtCard() {
	return txtCard;
}
public WebElement getTxtType() {
	return txtType;
}
public WebElement getTxtDate() {
	return txtDate;
}
public WebElement getTxtExpDate() {
	return txtExpDate;
}
public WebElement getTxtCvv() {
	return txtCvv;
}
public WebElement getBtnBook() {
	return btnBook;
}

public void Book(String first_name,String last_name,String address,String cc_num,String cc_type,String cc_exp_month,String cc_exp_year,String cc_cvv) {
send(getTxtFirstName(), first_name);
send(getTxtLastName(),last_name );
send(getTxtAddress(), address);
send(getTxtCard(), cc_num);
selectValue(getTxtType(), cc_type);
selectValue(getTxtDate(), cc_exp_month);
selectValue(getTxtExpDate(), cc_exp_year);
send(getTxtCvv(), cc_cvv);
click(getBtnBook());




}





}
