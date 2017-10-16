package com.org.learningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void m1(){
		System.out.println("Suhit");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("Shares");
	}
}
