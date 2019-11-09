package com.qaminds.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qaminds.coreappium.MyDriverAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage {

 private AndroidDriver<AndroidElement> driver;
 private final WebDriverWait wait;
 
 public BasePage(MyDriverAppium driver) {
	 this.wait = new WebDriverWait(driver.getDriver(), 10);
	 this.driver = driver.getDriver();
 }
 
 
 public WebDriverWait getWait() {
	 return wait;
 }
 
 public AndroidDriver<AndroidElement>getDriver(){
	 return driver;
 }
 
 public void waitVisibility(By locator) {
	 try {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	 }catch (org.openqa.selenium.TimeoutException e) {
		e.printStackTrace();
	}
 }
    
}
