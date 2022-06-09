package com.salesforce.common.test;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserMenuDropDown {
	@Test
	
	public static void TC05()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	}

	@Test
	
	public static void TC06() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]")).click();
		driver.switchTo().frame("contactInfoContentId");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
		
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys("TEST DATA");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).click();
		
		Thread.sleep(1000);
		/*driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click();
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("chatterUploadFileAction")).click();
		*/
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/li[1]/div[1]/div[1]/a[1]")).click();
		driver.switchTo().frame("uploadPhotoContentId");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/span[1]/form[1]/input[2]")).click();
	}	

	@Test

	public static void TC07() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		
		//driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.id("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[4]/div[2]/a[1]/span[2]")).click();		
		
	}

	@Test
	
	public static void TC08()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")).click();
		//WebElement console=driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]]"));
		//console.click();
		String oldwindow1=driver.getWindowHandle();
		Set<String> getAllWindows1=driver.getWindowHandles();
		String[] getWindow1=getAllWindows1.toArray(new String[getAllWindows1.size()]);
		driver.switchTo().window(getWindow1[1]);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(oldwindow1);
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@Test

	
	public static void TC09() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	}
}
