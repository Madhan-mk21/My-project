package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleProject extends BaseClass {
	
	@Test
	private void tc30() {
		launchUrl("https://inmakesedu.com/");
	}
	
	@Test
	private void tc35() {
		launchUrl("https://www.flipkart.com/");
	}
	
	
	@Test
	private void tc40()  {
		launchUrl("https://www.amazon.com/");
				
	}
	
	@BeforeMethod
	private void StartDate() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void endDate() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}
	
	@AfterClass
	private void closeTheBrowser() {
		System.out.println("Browser Close");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
