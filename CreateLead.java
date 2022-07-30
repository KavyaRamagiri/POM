package com.leaftaps.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.BaseClass;
import com.leaftaps.ui.pages.LoginPage;

public class CreateLead extends BaseClass {
	@BeforeTest
	public void setData() {
		excelFileName = "tc001";
		
	}
	@Test(dataProvider = "testData")
	public void test(String username,String password, String companyname, String firstname, String lastname) {
		//created pages so no need of below lines 

		
//		WebElement usernameElement = driver.findElement(By.id("username"));
//		usernameElement.sendKeys(username);
//		
//		WebElement passwordElement = driver.findElement(By.id("password"));
//		passwordElement.sendKeys(password);
//		
//		WebElement Loginbutton = driver.findElement(By.className("decorativeSubmit"));
//		Loginbutton.click();
//		
//		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
//		crmsfa.click();
//		
//		WebElement leads =driver.findElement(By.linkText("Leads"));
//		leads.click();
//		
//		WebElement createlead =driver.findElement(By.linkText("Create Lead"));
//		createlead.click();
//		
//		WebElement companynameElement = driver.findElement(By.id("createLeadForm_companyName"));
//		companynameElement.sendKeys(companyname);
//		
//		WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
//		firstnameElement.sendKeys(firstname);
//		
//		WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName"));
//		lastnameElement.sendKeys(lastname);
//		
//		WebElement createld = driver.findElement(By.className("smallSubmit"));
//		createld.click();
		
		new LoginPage()
		.enterUsername(username)
		.enterpassword(password)
		.clickloginbutton()
		.crmsfaclick()
		.homePage()
		.leads()
		.companynme(companyname)
		.firstnme(firstname)
		.lstname(lastname)
		.clickcreatelead();
		
		
		
		
		
	}
		
	}
	


