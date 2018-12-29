package com.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2");
		WebDriver  driver = new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}
	@Test
	public void methodOne() {
		System.out.println("Test");

		
	}
	@Test
	public void methodTwo() {

		Assert.assertEquals(12, 13);

	}

}
