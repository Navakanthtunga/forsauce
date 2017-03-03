package com.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpo {
	WebDriver driver=null;
		  public Registrationpo(WebDriver driver)
		  {
		    this.driver=driver;
		    PageFactory.initElements(driver,this);
		  }
	  // First name
		  
	  @FindBy(xpath="//input[@ placeholder='First Name']")
	  private WebElement eleFirstName;
	  public WebElement getEleFirstName()
	  {
		  return eleFirstName;
	  }
	  // Last name
	  
	  @FindBy(xpath="//input[@ placeholder='Last Name']")
	  private WebElement eleLastName;
	  public WebElement getEleLastName()
	  {
		  return eleLastName;
	  }
  // email
	  
	  @FindBy(xpath="//input[@type='email']")
	  private WebElement eleEmail;
	  public WebElement getEleEmail()
	  {
		  return eleEmail;
		  
	  }	  
  // phone
	  
	  @FindBy(xpath="//input[@type='tel']")
	  private WebElement elePhone;
	  public WebElement getElePhone()
	  {
		  return elePhone;
		  
	  }	  
	  // Submit button
	  @FindBy(id="submitbtn")
	  private WebElement eleSubmit;
	  public WebElement getEleSubmit()
	  {
		  return eleSubmit;
		  
	  }	  
}
