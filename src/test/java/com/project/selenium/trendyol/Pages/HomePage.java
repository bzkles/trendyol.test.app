package com.project.selenium.trendyol.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;	
	
    String baseUrl = "https://www.trendyol.com/";

    public HomePage(WebDriver driver) {
        this.driver =driver;
		//PageFactory.initElements(driver, this);
    }		
    
   
  //  @FindBy(xpath=" /html/body/div[8]/div/div/a") private WebElement closePopup;
  //  @FindBy(xpath="//*[@id=\"accountBtn\"]/div[1]/i") private WebElement loginIcon;
    
    WebElement closePopup = driver.findElement(By.xpath("/html/body/div[8]/div/div/a"));
    WebElement loginIcon = driver.findElement(By.xpath("//*[@id=\\\"accountBtn\\\"]/div[1]/i"));

    //close_"notification_options"_popup
    public void popupdismiss(){
    	closePopup.click();	
    }
    //open_loginform
    public void getLoginForm(){  	
    	loginIcon.click();		
	}
    
	public String getUrl(){
		return baseUrl;
	}
   
}
