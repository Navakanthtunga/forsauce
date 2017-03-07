package com.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseLibold {
	public static WebDriver driver;
	static public String sDirPath = System.getProperty("user.dir");
	@BeforeMethod
	public void setUp() {	 
	
				System.setProperty("webdriver.chrome.driver",sDirPath+"\\resources\\chromedriver.exe");
				System.out.println("Chrome Browser is set");
				driver = new ChromeDriver();
	}		
	public void settings(){
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void close(){
		driver.quit();
	}
}
