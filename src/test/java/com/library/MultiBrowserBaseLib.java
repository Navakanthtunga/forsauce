package com.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class MultiBrowserBaseLib {
	public static WebDriver driver;
	static public String sDirPath = System.getProperty("user.dir");
	@Parameters("browserName")
	@BeforeMethod
	public void getBrowser(String browser){
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
		
		/*System.setProperty("webdriver.chrome.driver",sDirPath+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		*/
/*		System.setProperty("webdriver.gecko.driver",sDirPath+"\\resources\\geckodriver.exe");
		System.out.println("Firefox Browser is set");*/
		
				
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	//@AfterMethod
	public void close(){
		driver.quit();
	}
	
}