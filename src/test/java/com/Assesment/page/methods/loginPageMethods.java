package com.Assesment.page.methods;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loginPageMethods {

	public  WebDriver driver;
	
	public void  launchbrowser()
	{
		ChromeOptions options = new ChromeOptions();							
		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");
		
		//rootpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\0023ZN744\\\\eclipse-workspace\\\\CucumberAssignment\\\\Driver\\\\chromedriver.exe");
		// Initialize browser
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
		
		
		
	}
	
	public void loginsauce()
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement un = driver.findElement(By.xpath("//*[@id='user-name']"));
		un.sendKeys("standard_user");
		WebElement pwd = driver.findElement(By.xpath("//*[@id='password']"));
		pwd.sendKeys("secret_sauce");
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id='login-button']"));
		loginbtn.click();
	}
}
