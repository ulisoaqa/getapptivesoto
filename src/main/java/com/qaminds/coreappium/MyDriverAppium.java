package com.qaminds.coreappium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyDriverAppium {
	Logger log = Logger.getLogger(MyDriverAppium.class);
	protected WebDriverWait wait;
 public AndroidDriver<AndroidElement> driver;
 
 public void setUpAppiumDriver() {

		final  File classpathRoot = new File (System.getProperty("user.dir"));
		DesiredCapabilities caps = new DesiredCapabilities();
		final File appDir = new File (classpathRoot, "src/test/resources/apps/");
		final File app = new File (appDir, "get_apptive.apk");
		
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.tekiti.getapptive");
		caps.setCapability("appActivity","com.tekiti.getapptive.SplashActivity");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("app",app.getAbsolutePath());

		try {
			driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			wait = new WebDriverWait(driver, 10);
		} catch (MalformedURLException e) {
			log.error("error  MyDriverAndroid.MyDriverAndroid()", e);
		}
 }	
 
	
public AndroidDriver<AndroidElement> getDriver(){
	return this.driver;
}
}
