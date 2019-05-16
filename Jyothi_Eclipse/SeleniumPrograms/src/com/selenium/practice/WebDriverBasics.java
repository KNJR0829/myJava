package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenjyothi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.quit();
	}

}
