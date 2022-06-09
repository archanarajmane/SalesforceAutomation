package com.salesforce.common.test;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	@Test
	
	public static void TC10() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //tbody/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("new account");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		
		
	}
	
	@Test
	
	public static void TC11() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("new view");
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("new_view");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	
	}
	
	@Test
	
	public static void TC12() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
		Thread.sleep(1000);
		WebElement selectView=driver.findElement(By.xpath("//select[@id='fcf']"));
		Select s=new Select(selectView);
		s.selectByVisibleText("new view");
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("updated view");
		//driver.findElement(By.xpath(" //input[@id='devname']")).sendKeys("updated_view");
		WebElement selectfield=driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select s1=new Select(selectfield);
		s1.selectByVisibleText("Account Name");
		WebElement selectoperator=driver.findElement(By.id("fop1"));
		Select s2=new Select(selectoperator);
		s2.selectByVisibleText("contains");
		WebElement selecdispfield=driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
		Select s3=new Select(selecdispfield);
		s3.selectByVisibleText("Last Activity");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[2]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		}
	
	@Test
	
	public static void TC13() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("archana");
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/input[2]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[2]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
}
	@Test
	
	public static void TC14() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		Thread.sleep(2000);
	
		//driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Created Date");
									//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]
		//driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]")).sendKeys("5/16/2022");
		driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]")).sendKeys("5/16/2022");
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[22]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("test report");
		driver.findElement(By.xpath("//body[1]/div[22]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("unique test report");
		
		driver.findElement(By.xpath("//body[1]/div[22]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]")).click();
	}
}