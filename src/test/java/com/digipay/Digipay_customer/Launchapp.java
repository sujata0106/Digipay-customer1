package com.digipay.Digipay_customer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Launchapp {

	public static AndroidDriver<MobileElement> driver ;
	@Test
	public void setup() throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	//set the package name of the app
	 cap.setCapability("appPackage", "com.digipay.guru");
	 //set the Launcher activity name of the app
	 cap.setCapability("appActivity", "com.digipay.guru.MainActivity");
       driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), cap);
 
	}
	
	@Test
	public void runapp() throws MalformedURLException
	
{
	//	MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup");
	//	el5.click();
		setup();
	//	System.out.println(Objects.isNull(driver) ? "Yes " : "No");		
		WebElement  token  =  driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		token.click();
		token.sendKeys("963258414");
		 driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).click();
				//driver.findElement(By.className("android.widget.ImageView"));
				//driver.findElement(By.className("android.view.ViewGroup"));
		       
		//token.sendKeys("965871411");
       // WebElement submit = driver.findElement(By.className("android.widget.ImageView"));		
       // submit.click();

}
}
