package com.leaftaps.ui.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.leaftaps.utils.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	//project specific class
	
	public static RemoteWebDriver driver; 
	public String excelFileName; 
	@Parameters({ "browserName", "URL" }) 
	@BeforeMethod
	public void beforeMethod(String browserName, String url) {  //parameters used for browsers
		if (browserName.equals("chrome")) { 
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
		} else { 
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		driver.get(url); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	} 
    @AfterMethod
    public void afterMethod() { 
    	driver.quit();
	}
    @DataProvider 
    public String[][] testData() throws IOException { 
    	return ReadExcelData.getData(excelFileName);
    }
}
