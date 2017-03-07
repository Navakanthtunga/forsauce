package com.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baselib {
	public static WebDriver driver;
	static public String sDirPath = System.getProperty("user.dir");
/*	public static final String USERNAME = "shradhanjalidalal";
	public static final String ACCESS_KEY = "4778fe48-9a83-4044-a236-0de35a9ab475";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";*/
	
@Parameters("browserName")
@BeforeMethod
public void setUp(String browser) throws Throwable {	 
	try{
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",sDirPath+"\\resources\\chromedriver.exe");
			System.out.println("Chrome Browser is set");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",sDirPath+"\\resources\\geckodriver.exe");
			System.out.println("Firefox Browser is set");
			driver = new FirefoxDriver();
			
		}
		else{
			System.setProperty("webdriver.ie.driver", sDirPath+"\\resources\\IEDriverServer.exe");
			System.out.println("InternetExplorer Browser is set");
			driver = new InternetExplorerDriver();
		}
	}

		catch(Exception e){
			System.out.println("Problem in launching driver");
			e.printStackTrace();
		}
}
public void settings(){
	//driver=new FirefoxDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}
public void close(){
	driver.quit();
}
public void tearDown() {
	try
	{
	driver.get("http://www.google.com");
	}
	catch(UnreachableBrowserException e){}
	}
	
	
}
