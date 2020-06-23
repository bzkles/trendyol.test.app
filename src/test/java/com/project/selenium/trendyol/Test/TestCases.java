package com.project.selenium.trendyol.Test;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.selenium.trendyol.Pages.HomePage;
import com.project.selenium.trendyol.Pages.LoginPage;
import com.project.selenium.trendyol.Pages.MyCartPage;
import com.project.selenium.trendyol.Pages.SearchPage;


public class TestCases extends TestBase {


	@Test
	public void getLogin() {
		
		HomePage homePage=new HomePage(driver);
		
		homePage.getLoginForm();
	
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	@Test
	public void setLoginFormCorrect()  {
		
		LoginPage loginpage = new LoginPage(driver);
				
		loginpage.SetLoginForm("testbzkl@yaani.com", "Trendyol11");

		loginpage.toLogin();
		
		//Assertconditinonswillhere
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	

	@Test
	public void WordSearch() {
		
		SearchPage searchpage = new SearchPage(driver);

		searchpage.clickSearch();
		searchpage.searchWord();
				
	}
	
	@Test
	public void AddToChart() {
		
		SearchPage searchpage = new SearchPage(driver);

		searchpage.clickResultExmpl();
		searchpage.clickAddToChart();
		
	}
	
	@Test
	public void CompareCost() {
		
		SearchPage searchpage = new SearchPage(driver);
        MyCartPage mycartpage = new MyCartPage(driver);
        
        mycartpage.goToMyChart();
        
        try{
        	Assert.assertSame(searchpage.firstitemcost,mycartpage.mycartcost);
        }catch (Exception e){ //CostCompareFailed
        	e.printStackTrace();
        }    
        
	}
	
	@Test
	public void DeleteItem() {
		
        MyCartPage mycartpage = new MyCartPage(driver);
       
        mycartpage.deleteItem();
        
        String truestring = "Sepetinizde ürün bulunmamaktadýr.";

        try{
        	assertTrue(mycartpage.emptycart.contains(truestring));
        }catch (Exception a) { //DeleteAllItemFailed
        	a.printStackTrace();
        }
    

	}
	
	
    
}
