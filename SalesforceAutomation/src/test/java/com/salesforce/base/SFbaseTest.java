package com.salesforce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SFbaseTest {

	protected static WebDriver driver;
	
	public static void getDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome driver instance created.....");
	}
	
	public static void gotoUrl(String url)
	{
		driver.get(url);
		System.out.println("Entered URL is : "+url);
	}
	
	public static void login(String username,String password)
	{
		
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	
	public static void closeDriver()
	{
		driver.close();
	}
	
}