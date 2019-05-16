package com.apex.test.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://ecommerce.saipratap.net/customerlogin.php");
		WebElement emailelement = driver.findElement(By.id("email"));
		emailelement.sendKeys("nagajothireddy@gmail.com");
		WebElement passwordelement = driver.findElement(By.id("password"));
		passwordelement.sendKeys("apex2018");
		WebElement login=driver.findElement(By.linkText("Login"));
		login.click();
		driver.close();
		
	}

}
