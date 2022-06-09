package com.salesforce.common.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOpty {
	@Test
	
	public static void TC15() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/select[1]")).click();
		}

@Test

	public static void TC16() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/input[1]")).sendKeys("new opty");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/input[1]")).sendKeys("archana");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/a[1]")).click();
		
		WebElement selectStage=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[4]/div[1]/span[1]/select[1]"));
		Select s=new Select(selectStage);
		s.selectByVisibleText("Qualification");
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[4]/input[1]")).click();
		
		WebElement selectLeadSrc=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[6]/td[2]/span[1]/select[1]"));
		Select s1=new Select(selectLeadSrc);
		s1.selectByVisibleText("Web");
	
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		
	}

	@Test
	
	public static void TC17() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		
	}
	
	@Test
	
	public static void TC18() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	}
	
	@Test
	
	public static void TC19() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		//driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]")).click();
		WebElement selectSummeryInterval=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/select[1]"));
		Select s=new Select(selectSummeryInterval);
		s.selectByVisibleText("Next FQ");
		
		WebElement selectSummeryInclude=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/select[1]"));
		Select s1=new Select(selectSummeryInclude);
		s1.selectByVisibleText("Open Opportunities");
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")).click();
		
	}
}
