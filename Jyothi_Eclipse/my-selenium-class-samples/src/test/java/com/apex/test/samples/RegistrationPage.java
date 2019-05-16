package com.apex.test.samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		
		//1.Create a driver

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://ecommerce.saipratap.net/customer.php");
		driver.findElement(By.linkText("signup")).click();
		
		//driver.findElement(By.xpath("//input[@value='2']")).click();
		WebElement firstName = driver.findElement(By.id("fname"));
		firstName.sendKeys("Jyothi");
		
		/*driver.findElement(By.id("fname")).sendKeys("Jyothi ");
		driver.findElement(By.id("lname")).sendKeys("K");
		driver.findElement(By.id("day")).sendKeys("10 ");
		driver.findElement(By.id("month")).sendKeys("12 ");
		driver.findElement(By.id("year")).sendKeys("1992");
		driver.findElement(By.id("email")).sendKeys("jyothi@gmail.com");
		driver.findElement(By.id("city")).sendKeys("Fremont ");
		driver.findElement(By.id("state")).sendKeys("CA");
		driver.findElement(By.id("password")).sendKeys("apex2018 ");
		driver.findElement(By.id("cpassword")).sendKeys("apex2018 ");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);*/
	}

}
