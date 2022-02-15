package com.Assesment.pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	
	@FindBy(how=How.ID,using="twotabsearchtextbox")
	WebElement searchbox;
	
	
	@FindBy(how=How.ID,using="nav-search-submit-button")
	WebElement searchbutton;
	
	
	@FindBy(how=How.XPATH,using="(//img[@alt=\"Ringke Back Cover for OnePlus 7 Pro (Hard|PC and TPU|Black)\"])[1]")
	WebElement product;
	
	@FindBy(how=How.ID,using="add-to-cart-button")
	WebElement addtocart;
	
	
	@FindBy(how=How.XPATH,using="//span[@class=\"a-truncate-cut\"]")
	List<WebElement> allElements;
	
	
	
	
	public void EnterSearchtext(String prdouct)
	
	{
		//System.out.println("Test in login method");	
		searchbox.sendKeys(prdouct);
		
	}	
	
    public void clickSearchbutton()
	
	{
		//System.out.println("Test in login method");	
    	searchbutton.click();
    	
	}
    
  public void clickaddtocart()
	
	{
		//System.out.println("Test in login method");	
	  addtocart.click();
		
	}	
    
  
    
    
    public void searchresult(String productname) throws InterruptedException
    {
    	
    	for(WebElement ele:allElements)
    	{
    		String str=ele.getText();
    		if (str.equalsIgnoreCase(productname))
    				{
    			     
    			    selectproduct();
    			    System.out.println("Selected the product successfully"+productname);
    			    Thread.sleep(3000);
    			    clickaddtocart();
    			    
    			    
    				}
    		else
    		{
    			System.out.println("Product is not listed:"+productname );
    		}
    	}
    }
    
       
    public void selectproduct()
    {
    	product.click();
    	
    }
    
	
}
