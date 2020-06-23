package com.project.selenium.trendyol.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
			
		 this.driver =driver;
			
	  }
	
  // @FindBy(xpath = "//*[@id=\"email\"]" ) public WebElement userEmail; 
  // @FindBy(xpath ="/html/body/div[11]/div/div/div/div/div/div/div[1]/div/div[1]/div/div/form/section[2]/div/input" ) private WebElement userPassword;
  // @FindBy(id ="loginSubmit") private WebElement btnLogin;
   
  /* By useremail =By.id("email");
	 By userpassword = By.id("password");
	 By loginbtn = By.id("loginSubmit");  */
   

	WebElement useremail= driver.findElement(By.xpath("//input[@id='email']"));
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));    
    WebElement btnLogin = driver.findElement(By.id("loginSubmit"));  
		  
   //Set_loginForm
   public void SetLoginForm(String email, String password) {
	   
		this.useremail.sendKeys(email);
		this.password.sendKeys(password);
    }  
	 
    //Login_button
    public void toLogin() {	
 		this.btnLogin.click(); 
 	}

}
