package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal{ 
	public SelectHotel() {
PageFactory.initElements(driver, this);
	}
@FindBy(id="radiobutton_0")
private WebElement btnSelect;
public WebElement getBtnSelect() {
	return btnSelect;
}
public WebElement getBtnContinue() {
	return btnContinue;
}
@FindBy(id="continue")
private WebElement btnContinue;

public void Select() {
	click(getBtnContinue());

}
}












