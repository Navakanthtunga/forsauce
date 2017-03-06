package com.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.library.Baselib;
import com.po.Registrationpo;

public class RegestrationTest extends Baselib{

	@Test(priority=1)
	public void register1() throws Throwable{
	try{
	Registrationpo regpo=new Registrationpo(driver);
	settings();
	Thread.sleep(3000);
	regpo.getEleFirstName().sendKeys("crowd");
	regpo.getEleLastName().sendKeys("123");
	regpo.getEleEmail().sendKeys("cbtcrowd508@gmail.com");
	regpo.getElePhone().sendKeys("7894561236");
	Thread.sleep(5000);
	regpo.getEleSubmit().click();

	}catch(Exception e){
		e.printStackTrace();
	}
}
	/*@Test(priority=2)
	public void register2() throws Throwable{
		try
		{
	Registrationpo regpo=new Registrationpo(driver);
	regpo.settings();
	Thread.sleep(3000);
	regpo.getEleFirstName().sendKeys("crowd");
	regpo.getEleLastName().sendKeys("123");
	regpo.getEleEmail().sendKeys("cbtcrowd508@gmail.com");
	regpo.getElePhone().sendKeys("7894561236");
	Thread.sleep(5000);
	regpo.getEleSubmit().click();

		}catch(Exception e){
			e.printStackTrace();
		}
}*/
	
}