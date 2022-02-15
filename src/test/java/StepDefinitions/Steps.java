package StepDefinitions;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;			
    		
    @Given("Open the chrome and launch the application")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
    	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\0023ZN744\\\\eclipse-workspace\\\\CucumberAssignment\\\\Driver\\\\chromedriver.exe");;					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
       driver.get("https://www.saucedemo.com");	
       System.out.println(driver.getTitle());
    }		

    @When("Enter the Username and Password")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
    	

		WebElement un = driver.findElement(By.xpath("//*[@id='user-name']"));
		un.sendKeys("standard_user");
		WebElement pwd = driver.findElement(By.xpath("//*[@id='password']"));
		pwd.sendKeys("secret_sauce");
		Thread.sleep(2000);
								
    }		

    @Then("Click on login")					
    public void click_on_login() throws Throwable 							
    {		
    	WebElement loginbtn = driver.findElement(By.xpath("//*[@id='login-button']"));
		loginbtn.click();
		Thread.sleep(2000);
    }	
    
    @Then("Close the browser")
    public void Close_the_Browser()
    {
    	driver.quit();
    }
    
    @Given("Add item to cart")					
    public void Add_Item_Cart() throws Throwable							
    {		
    	WebElement item = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		item.click();
		Thread.sleep(2000);	
		
		
		
    }	
    @Then("Remove From Cart")
    public void remove_item_fromcart() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    	Thread.sleep(2000);
    	System.out.println(driver.findElement(By.xpath("//a/div")).getText());
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
    	Thread.sleep(1000);
    	
    	
    }

    

}