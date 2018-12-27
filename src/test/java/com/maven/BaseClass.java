package com.maven;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/waqaskhan/Downloads/chromedriver");
		WebDriver  driver = new ChromeDriver();
//	    driver.manage().window().fullscreen();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/");
// this is a working code this will open browser in chrome driver
	}

}
