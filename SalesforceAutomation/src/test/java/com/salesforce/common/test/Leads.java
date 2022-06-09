package com.salesforce.common.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads {

	@Test
	
	public static void TC20() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	}
	
	@Test
	
	public static void TC21() throws InterruptedException 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/select[1]")).click();
		
	}
	
	@Test
	
	public static void TC22() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
		
		WebElement selectLeadsView=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/select[1]"));
		Select s1=new Select(selectLeadsView);
		s1.selectByVisibleText("Today's Leads");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]")).click();
	}
	
	@Test
	
	public static void TC23() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
		
		WebElement selectLeadsView=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/select[1]"));
		Select s1=new Select(selectLeadsView);
		s1.selectByVisibleText("Today's Leads");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]")).click();
	}
	
	@Test
	
	public static void T24() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/input[1]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/input[1]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		
	}
}
