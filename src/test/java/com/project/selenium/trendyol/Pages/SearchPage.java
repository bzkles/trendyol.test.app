package com.project.selenium.trendyol.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.project.selenium.trendyol.InputExample.SearchInput;



public class SearchPage  extends SearchInput{

	WebDriver driver;

	public SearchPage(WebDriver driver) {
		 this.driver =driver;
	}
	
	WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/input"));
	WebElement searchicon = driver.findElement(By.xpath("//*[@id=\"auto-complete-app\"]/div/div/i"));
	
	WebElement firstitem = driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/a/div[3]/div[1]/div[1]/span[2]"));
	public String firstitemcost = driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div"
			                                                  + "/div[1]/div[1]/a/div[3]/div[2]/div[2]")).getText();
	
	
    WebElement addtochart = driver.findElement(By.xpath("//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[1]/button[1]/div[1]"));
	
    public void clickSearch() {
		
		searchbox.click();
		
		searchbox.sendKeys(text);
		
	}
	
	public void searchWord() {
		
		searchicon.click();
	}
	
	public void clickResultExmpl() {
		
		firstitem.click();
		
	}
	
	public void clickAddToChart() {
		
		addtochart.click();
	}
}
