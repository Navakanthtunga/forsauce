package com.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParalleBaselib {
	public static WebDriver driver;
	static public String sDirPath = System.getProperty("user.dir");
	@BeforeMethod
	public void setup(){
		/*System.setProperty("webdriver.gecko.driver",sDirPath+"\\resources\\geckodriver.exe");
		System.out.println("Firefox Browser is set");
		driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver",sDirPath+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	
	public void settings(){
		//driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
