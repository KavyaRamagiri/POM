package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leaftaps.ui.base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage() {
		
	}
	
	public CreateLeadPage companynme(String companyname) {
		WebElement companynameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companynameElement.sendKeys(companyname);
		return this;
	}
	
	public CreateLeadPage firstnme(String firstname) {
		WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstnameElement.sendKeys(firstname);
		return this;
	}
	
	public CreateLeadPage lstname(String lastname) {
		WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastnameElement.sendKeys(lastname);
		return this;
	}
	
	public ViewLeadpage clickcreatelead() {
		WebElement createld = driver.findElement(By.className("smallSubmit"));
		createld.click();
		return new ViewLeadpage();
	}
	
	
	
	
	
	
	

}
