package com.xworkz.product.dto;

import com.xworkz.encpsulation.Morzilla_browser;

public class BrowserRunner {

	public static void main(String[] args) {
		Morzilla_browser morzilla_browser=new Morzilla_browser();
		morzilla_browser.connect();
		morzilla_browser.developer();
		morzilla_browser.showTime();
		String name=morzilla_browser.getName();
		System.out.println(name);
	String version=	morzilla_browser.getversion();
	System.out.println(version);
	String company=	morzilla_browser.getCompany();
	System.out.println(company);
		morzilla_browser.cleanup();
		int intvalue=morzilla_browser.hashCode();
		
	}

}
