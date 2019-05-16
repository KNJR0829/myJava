package com.apex.test.samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlaceAnOrder {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://ecommerce.saipratap.net/products.php");
		driver.findElement(By.xpath("//*[@id='rightcontent']/p[2]/a/img")).click();
		driver.findElement(By.xpath("input[@value='add to cart']")).click();
		//driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(2) > table > nth-child(1) > tbody >tr:nth-child(3)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='rightcontent']/p[2]/a/img"));
		driver.findElement(By.xpath("input[@value='add to cart']")).click();
		driver.findElement(By.linkText("checkout")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("nagajothi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("apex2018");
		driver.findElement(By.linkText("login")).click();
	}

}
