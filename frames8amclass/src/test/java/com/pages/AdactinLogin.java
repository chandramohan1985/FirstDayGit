package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends LibGlobal{
	
	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
 @FindBy(id="username")
private WebElement txtUserName;
 @FindBy(id="password")
private WebElement txtPassword;
public WebElement getTxtUserName() {
	return txtUserName;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
public WebElement getTxtLogin() {
	return txtLogin;
}
@FindBy(id="login")
private WebElement txtLogin;

public void login(String username, String password) {
	send(getTxtUserName(), username);
send(getTxtPassword(), password);
click(getTxtLogin());
	
	
	
}







}

	
	
	

