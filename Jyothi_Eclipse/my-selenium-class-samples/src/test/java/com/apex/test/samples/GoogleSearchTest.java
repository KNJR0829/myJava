package com.apex.test.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {

		// 1.create a driver
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		// 2.open page
		driver.get("https://www.google.com");
		// 3.identify the locators and perform action
		WebElement searchBoxEl = driver.findElement(By.name("q"));
		searchBoxEl.sendKeys("Java book");
		Thread.sleep(1000);
		// 4. perform action
		WebElement searchBtn=driver.findElement(By.name("btnK"));
		searchBtn.click();
		// 5.validate
		String Title=driver.getTitle();
		if(Title.equals("Google Search")) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test is failed");
				
		}
		// 6. close
		driver.close();
	}

}
