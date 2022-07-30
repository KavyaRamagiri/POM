package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leaftaps.ui.base.BaseClass;

public class Welcomepage extends BaseClass {
	
	public Welcomepage() {
		
		
	}
	
	public HomePage crmsfaclick() {
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		return new HomePage();
	}
	
	public LoginPage logoutButton() {
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		logout.click();
		return new LoginPage();
	}
	
	
	
	
	
	
	
	

}
