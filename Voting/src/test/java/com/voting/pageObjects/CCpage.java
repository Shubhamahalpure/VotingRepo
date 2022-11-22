package com.voting.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CCpage extends BaseClass {
	
	WebDriver driver;
	
	public CCpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'Kaylene Eckels')]//preceding::div[2]")
	WebElement checkOption;
	
	@FindBy(xpath="//*[@id=\"user-login-registration-form\"]/div[2]/div/input")
	WebElement txtEmail;
	
	@FindBy(xpath="//button[normalize-space()='Sign Up']")
	WebElement clickSignup;
	
	@FindBy(xpath="//div[@id='newsletterTab']//button[1]")
	WebElement submit;
	
	@FindBy(xpath="//div[@class='form-group required col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-9 col-md-offset-2']//input[@placeholder='First Name']")
	WebElement firstName;
	
	@FindBy(xpath="//div[@class='form-group required col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-9 col-md-offset-2']//input[@placeholder='Last Name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//button[@class='btn flat btn-warning center-block submit-form-button']")
	WebElement clickMoving;
	
	//Mailinator
	@FindBy(xpath="//*[@id=\"inbox_field\"]")
	WebElement enterMail;
	
	@FindBy(xpath="//*[@class='primary-btn']")
	WebElement clickGo;
	
	@FindBy(xpath="//td[normalize-space()='Customer Contact Central Account Information']")
	WebElement clickMail;
	
	@FindBy(xpath="//a[normalize-space()='Verify Your Email']")
	WebElement clickVerify;
	
	@FindBy(xpath="//*[@id=\"email-confirmation\"]/div/div/div[2]/div/p[2]/a")
	WebElement clickVerifyEmailAdd;
	
	@FindBy(xpath="//div[@id='fullCompleteRegistrationForm']//button[@aria-label='Close']")
	WebElement closeBtn;
	
	@FindBy(xpath="//*[contains(text(),'Kaylene Eckels')]//preceding::div[2]")
	WebElement clickOption;
	
	@FindBy(xpath="//*[contains(text(),'Jim Iyoob')]//preceding::div[2]")
	WebElement clickKE;
	
	
	public void clickOption()
	{
		checkOption.click();
	}
	
	public void enterEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void clickOnSignup()
	{
		clickSignup.click();
	}
	public void clickOnSubmit()
	{
		submit.click();
	}
	
	
	
	public void enterFirstName(String fn)
	{
		firstName.sendKeys(fn);
	}
	public void enterLastName(String ln)
	{
		lastName.sendKeys(ln);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void enterConfirmPassword(String cp)
	{
		confirmpassword.sendKeys(cp);
	}
	
	public void clickMovingOn()
	{
		clickMoving.click();
	}
	
	public void clearMailinator()
	{
		enterMail.clear();
	}
	public void enterMailinator(String ml)
	{
		enterMail.sendKeys(ml);
	}
	
	public void clickGoBtn()
	{
		clickGo.click();
	}
	public void openMail()
	{
		clickMail.click();
	}
	public void verifyMail()
	{
		clickVerify.click();
	}
	
	public void verifyMailAddress()
	{
		clickVerifyEmailAdd.click();
	}
	
	
	public void clickClose()
	{
		closeBtn.click();
	}
	
	public void selectOption()
	{
		clickOption.click();
	}
	
	public void selectKE()
	{
		clickKE.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
