package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leaftaps.ui.base.BaseClass;

public class Leadspage extends BaseClass {
	
	public Leadspage() {
		
	}
	
	public CreateLeadPage leads() {
		WebElement createlead =driver.findElement(By.linkText("Create Lead"));
		createlead.click(); 
		return new CreateLeadPage();
	}

}
