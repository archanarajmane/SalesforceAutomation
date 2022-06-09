package com.salesforce.common.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.AssertionError;
import java.time.LocalDate;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomScenarios {
	
	@Test
	
	public static void TC33() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		Assert.assertEquals("Archana Abcd",driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).getText());
		System.out.println("Username is same.");
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).click();
		
		Assert.assertEquals("https://tekarch-b-dev-ed.my.salesforce.com/_ui/core/userprofile/UserProfilePage?tab=sfdc.ProfilePlatformFeed", driver.getCurrentUrl());
	
	}
	
	@Test
	
	public static void TC34() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]")).click();
	
		Thread.sleep(1000);
		driver.switchTo().frame("contactInfoContentId");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Assert.assertEquals("Archana ABCD",driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).getText());
		System.out.println("Verified Updated lastname on Home page..");
		
		//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]")).click();
		Assert.assertEquals("Archana ABCD",driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]")).getText());
		System.out.println("Verified User menu for Updated lastname..");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).click();
		Assert.assertEquals("Archana ABCD ",driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[2]/span[3]")).getText());
		System.out.println("Verified User page for updated last name..");
	}
	
	@Test
	
	public static void TC35() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		driver.findElement(By.className("allTabsArrow")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("btnImportant")).click();
		
		Thread.sleep(1000);
		WebElement selectTab=driver.findElement(By.id("duel_select_1"));
		Select s=new Select(selectTab);
		s.selectByVisibleText("Assets");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	}
	
	@Test
	
	public static void TC36() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		//String a=LocalDate.toString(java.time.LocalDate.now());
		/*LocalDate today = LocalDate.now();
		String a = today.toString();
		
		System.out.println(today.toString());
		 */
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[29]/a[1]")).click();
		//driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/a[1]/img[1]")).click();
		Thread.sleep(4000);
		
		
		//driver.findElement(By.xpath("//body[1]/div[2]/ul[1]/li[5]/a[1]")).click();
		////*[@id="ep"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img
		//Thread.sleep(2000);
		/*String winHandleBefore = driver.getWindowHandle();
		
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		    System.out.println(winHandleBefore);
		    System.out.println(winHandle);
		    System.out.println(driver.switchTo().window(winHandle).getTitle());
		    //driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a")).click();
		    
		    
		}
		System.out.println(driver.switchTo().window(winHandleBefore).getTitle());
		   // driver.close();
		    driver.switchTo().window(winHandleBefore);
		    driver.findElement(By.xpath("//a[text()='Other']")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a/script")).click();
	*/
	
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")).sendKeys("Other");
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("9:00 PM");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("11:30 PM");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	}

	@Test
	
	public static void TC37() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[21]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/a[1]/img[1]")).click();

		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")).sendKeys("Other");
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("5:00 PM");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("11:30 PM");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("7:00 PM");
		
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[8]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[8]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[8]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[2]/table[1]/tbody[1]/tr[6]/td[2]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body.hasMotif.eventTab.ext-webkit.ext-chrome.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outer td.oRight div.bPageTitle:nth-child(2) div.calendarHeader.calendarHeaderBG span.dwmIcons a:nth-child(3) > img.monthViewIconOn")).click();
	}
	

}
