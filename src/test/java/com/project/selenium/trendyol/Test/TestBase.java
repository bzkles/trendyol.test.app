package com.project.selenium.trendyol.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.selenium.trendyol.Pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.*;

public class TestBase {
	
	public static WebDriver driver = null;
	
	@BeforeClass
	public static void SetUp()  {
		
           System.setProperty("webdriver.chrome.driver", 
            		            "C:\\trendyol.test.app\\drivers\\chromedriver.exe");
            
	
	        driver = new ChromeDriver();
	        
            HomePage obj = new HomePage(driver);
	        
	        driver.get(obj.getUrl());
	     
	        obj.popupdismiss();

            driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	
	/*public WebDriver getDriver(){
		
		return driver;
	} */
	
	@AfterClass
	public static void after() throws InterruptedException{
		
		Thread.sleep(3000);
		driver.quit();

	} 
	
}
