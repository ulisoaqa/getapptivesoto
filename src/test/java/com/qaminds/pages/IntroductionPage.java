package com.qaminds.pages;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage {

	public IntroductionPage(MyDriverAppium driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public final String titleIntroductionID = "section_Label";
	
	public boolean getTitleIntroduction() {
		
		System.out.println("llegas al metodo" + titleIntroductionID);
		AndroidElement titleIntroduction = getDriver().findElementById(titleIntroductionID);
		System.out.println("y pintas esto?" + titleIntroduction);
		return titleIntroduction.isDisplayed();
	}
}
