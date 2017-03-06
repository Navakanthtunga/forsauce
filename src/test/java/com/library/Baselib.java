package com.library;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baselib {
	public static WebDriver driver;
	static public String sDirPath = System.getProperty("user.dir");
	public static final String USERNAME = "shradhanjalidalal";
	public static final String ACCESS_KEY = "4778fe48-9a83-4044-a236-0de35a9ab475";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
@Parameters("browserName")
@BeforeMethod
/*public void setUp(String browser) {
		if(browser.equalsIgnoreCase("Firefox")){
			
			
			System.setProperty("webdriver.gecko.driver",sDirPath+"\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
		else if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",sDirPath+"\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}*/
public void setUp(String browser) throws Throwable {	
	DesiredCapabilities caps = DesiredCapabilities.firefox();
   caps.setCapability("platform", "Windows 7");
    caps.setCapability("version", "51.0");
    caps.setCapability("name","demo site");
    driver = new RemoteWebDriver(new URL(URL),caps);
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
