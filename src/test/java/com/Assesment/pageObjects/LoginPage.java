package com.Assesment.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.ID,using="ap_email")
	WebElement username;
	
	@FindBy(how=How.ID,using="continue")
	WebElement btnContinue;
	
	@FindBy(how=How.ID,using="ap_password")
	WebElement password;
	
	@FindBy(how=How.ID,using="signInSubmit")
	WebElement btnLogin;
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-link-accountList']")
	WebElement Accounts_list;
	
		
	@FindBy(how=How.XPATH,using="//span[text()='Sign Out']")
	WebElement logout;
	
	@FindBy(how=How.ID,using="auth-error-message-box")
	WebElement error;
	
	/// Saucelab Elements starts from here.
	
	@FindBy(how=How.ID,using="user-name")
	WebElement sauce_username;
	
	@FindBy(how=How.ID,using="password")
	WebElement sauce_pwd;
	
	@FindBy(how=How.ID,using="login-button")
	WebElement sauce_login;
	
	
  public Boolean sauceLogin(String UserId,String Password)
	
	{
		//System.out.println("Test in login method");	
		sauce_username.sendKeys(UserId);
		sauce_pwd.sendKeys(Password);		
		sauce_login.click();
		String title=ldriver.getTitle();
		System.out.println(ldriver.getTitle());
		if (title.contains("Sign In"))
		{
			return false;
		}
		return true;

	}		
	
	
	
	public Boolean amazonLogin(String UserId,String Password)
	
	{
		//System.out.println("Test in login method");	
		username.sendKeys(UserId);
		btnContinue.click();
		password.sendKeys(Password);		
		btnLogin.click();
		String title=ldriver.getTitle();
		System.out.println(ldriver.getTitle());
		if (title.contains("Sign In"))
		{
			return false;
		}
		return true;
		
	}		
    public void amazonLogout() throws InterruptedException
    {
    	Actions action = new Actions(ldriver);
	    //WebElement elementToHover=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"));
	    //action.moveToElement(ele).perform();
	    //WebElement elementToClick=driver.findElement(By.xpath("//span[text()='Sign Out']"));
	    action.moveToElement(Accounts_list).click(logout).build().perform();
	    System.out.println("Amazon is loogged out successfully.");
    	
    	
    }
    
    public Boolean IsDisplayed()
    {
    	
    	return Accounts_list.isDisplayed();
    	 
    }
	
	
}
