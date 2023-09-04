package org.test;

import org.base.BaseClass;
import org.testng.annotations.Test;

public class Example extends BaseClass{

	@Test(priority = 5)
	private void tc70() {
		System.out.println("test case 70");
	}
	
	@Test(priority = -10)
	private void tc73() {
		System.out.println("test case 73");
	}
	
	@Test(priority =0 )
	private void tc75() {
		System.out.println("test case 75");

	}
	
	@Test(priority = 21 )
	private void tc77() {
		System.out.println("test case 77");

	}
	
	@Test(priority =-30 )
	private void tc79() {
		System.out.println("test case 79");
	}
	
	@Test(priority = 15)
	private void tc81() {
		System.out.println("test case 81");
	}
	
	@Test(priority = 1)
	private void tc83() {
		System.out.println("test case 83");

	}
	
	
	
	
	
}


