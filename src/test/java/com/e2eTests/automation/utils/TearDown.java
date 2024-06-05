package com.e2eTests.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TearDown {
	
	/**
	 * This method is used to close browser. This method is called after the
	 * invocation of each test method in given class.
	 * 
	 * @After Methods annotated with @After execute after every scenario.
	 */
    @After 
	public void quitDriver(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshoot = ((TakesScreenshot)Setup.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshoot, "image/png", "screenshoot");
		}
		
		Setup.getDriver().quit();
	}
}
