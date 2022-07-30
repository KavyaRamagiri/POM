package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leaftaps.ui.base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
			
	}
	
	public LoginPage enterUsername(String username) {
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys(username); 
		//LoginPage obj= new LoginPage();
		return this;
	}
	public LoginPage enterpassword(String password) {
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys(password);
		return this;
	}
	public Welcomepage clickloginbutton() {
		WebElement Loginbutton = driver.findElement(By.className("decorativeSubmit"));
		Loginbutton.click();
		return new Welcomepage();
	}

	
	
	
	

}
