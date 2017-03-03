package com.library;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public class Baselib {
	public static WebDriver driver;
	public static final String USERNAME = "shradhanjalidalal";
	public static final String ACCESS_KEY = "4778fe48-9a83-4044-a236-0de35a9ab475";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
@BeforeMethod

public void setUp() throws MalformedURLException{
	DesiredCapabilities caps = DesiredCapabilities.firefox();
    caps.setCapability("platform", "Windows 8");
    caps.setCapability("version", "51.0");
    caps.setCapability("name","Voonik Sample Test");
    driver = new RemoteWebDriver(new URL(URL),caps);
}
public void settings(){
	//driver=new FirefoxDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}
}
