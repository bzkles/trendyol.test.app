package com.project.selenium.trendyol.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyCartPage {
	
	
	 WebDriver driver;
		
	 public MyCartPage(WebDriver driver) {
			
		 this.driver =driver;
			
	  }
	 
	 
    public String mycartcost = 
           driver.findElement(By.xpath("//*[@id=\"basketContent\"]/div[3]/div/div/ul/li/div[2]/div[4]/div[2]")).getText();
	
    WebElement mycart = 
           driver.findElement(By.xpath("//*[@id=\"myBasketListItem\"]/div[1]/a/i"));
    
    WebElement itemdelete = 
           driver.findElement(By.xpath("//*[@id=\"basketContent\"]/div[3]/div/div/ul/li/div[2]/div[5]/a"));
	
    WebElement itemdeletesure = 
           driver.findElement(By.xpath("  //*[@id=\"ngdialog1\"]/div[2]/form/div/div[2]/div/button[2]\r\n" + ""));

    public String emptycart = driver.findElement(By.xpath("//*[@id=\"basketNoProductPage\"]/div[2]/div/div[1]/p/span")).getText();
    
    public void goToMyChart() {
    	this.mycart.click();
    }
    
    public void deleteItem() {
    	
    	this.itemdelete.click();
    	this.itemdeletesure.click();
    	
    }
    
}
