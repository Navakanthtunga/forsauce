package com.scripts;

import org.testng.annotations.Test;

import com.library.ParalleBaselib;
import com.po.Registrationpo;

public class RegestrationTest2 extends ParalleBaselib{

	@Test(priority=1)
	public void register1() throws Throwable{
	try{
	Registrationpo regpo=new Registrationpo(driver);
	Thread.sleep(3000);
	//settings();
	regpo.getEleFirstName().sendKeys("crowd1");
	regpo.getEleLastName().sendKeys("123");
	regpo.getEleEmail().sendKeys("cbtcrowd508@gmail.com");
	regpo.getElePhone().sendKeys("7894561236");
	Thread.sleep(3000);
	System.out.println("register1() in : "+Thread.currentThread().getId());
	regpo.getEleSubmit().click();
	
	}catch(Exception e){
		e.printStackTrace();
	}
}
	@Test(priority=2)
	public void register2() throws Throwable{
	try{
	Registrationpo regpo=new Registrationpo(driver);
	Thread.sleep(3000);
	//settings();
	regpo.getEleFirstName().sendKeys("crowd2");
	regpo.getEleLastName().sendKeys("123");
	regpo.getEleEmail().sendKeys("cbtcrowd508@gmail.com");
	regpo.getElePhone().sendKeys("7894561236");
	Thread.sleep(3000);
	System.out.println("register1() in : "+Thread.currentThread().getId());
	regpo.getEleSubmit().click();

	}catch(Exception e){
		e.printStackTrace();
	}
}
}