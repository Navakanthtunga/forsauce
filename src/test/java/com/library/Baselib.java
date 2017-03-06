package com.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baselib {
	public static WebDriver driver;
	static public String sDirPath = System.getProperty("user.dir");
/*	public static final String USERNAME = "navakanthtunga1258";
	public static final String ACCESS_KEY = "c250c622-7bbc-4f1f-8fe0-0da2656b5e6d";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";*/
@Parameters("browserName")
@BeforeMethod
<<<<<<< HEAD
public void setUp(String browser) {
		if(browser.equalsIgnoreCase("Firefox")){
			
			
			System.setProperty("webdriver.gecko.driver",sDirPath+"\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
		else if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",sDirPath+"\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
/*	DesiredCapabilities caps = DesiredCapabilities.firefox();
   caps.setCapability("platform", "Windows 7");
=======

public void setUp() throws MalformedURLException{
	DesiredCapabilities caps = DesiredCapabilities.firefox();
    caps.setCapability("platform", "Windows 7");
>>>>>>> origin/master
    caps.setCapability("version", "51.0");
    caps.setCapability("name","demo site");
    driver = new RemoteWebDriver(new URL(URL),caps);*/
}
public void settings(){
	//driver=new FirefoxDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}
@AfterMethod
public void tearDown() {
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	driver.quit();
	
	
}

}
