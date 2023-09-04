package org.poj;

import org.base.BaseClass;

public class Sample extends BaseClass{
	public static void main(String[] args) {
		
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/login/");
		windowMaximize();
		
		FbLoginPojo f = new FbLoginPojo();
		
		passText("madhan", f.getEmail());
		passText("kumar", f.getPassword());
		clickBtn(f.getLoginBtn());
		
		
		
		
		
		
	
		
		
		
		
	}
	
}
