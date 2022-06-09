package com.salesforce.common.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SFDCLogin {
	
	@Test
	
	public static void TC01()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	}
	@Test
	
	public static void TC02()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	
	@Test
	
	public static void TC03() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='rememberUn']")).isSelected();
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	}
	
	@Test
	
	public static void TC04A()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}
	
	@Test
	
	public static void TC04B()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.id("password")).sendKeys("22131");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		
	}
}
