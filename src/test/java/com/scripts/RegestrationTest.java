package com.scripts;

import org.testng.annotations.Test;

import com.library.Baselib;
import com.po.Registrationpo;

public class RegestrationTest extends Baselib{

	@Test
	public void register() throws Throwable{
			
	Registrationpo regpo=new Registrationpo(driver);
	Thread.sleep(3000);
	regpo.getEleFirstName().sendKeys("crowd");
	regpo.getEleLastName().sendKeys("123");
	regpo.getEleEmail().sendKeys("cbtcrowd508@gmail.com");
	regpo.getElePhone().sendKeys("7894561236");
	Thread.sleep(5000);
	regpo.getEleSubmit().click();
	
}
}