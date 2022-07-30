package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.leaftaps.ui.base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage() {
		
	}

	public Leadspage homePage() {
		WebElement leads =driver.findElement(By.linkText("Leads"));
		leads.click();
		return new Leadspage();
		
	}
	
	
	
	
	
	

}
