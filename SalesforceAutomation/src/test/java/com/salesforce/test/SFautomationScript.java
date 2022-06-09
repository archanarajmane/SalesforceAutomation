package com.salesforce.test;

import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.salesforce.base.SFbaseTest;



public class SFautomationScript extends SFbaseTest{
	
	@Test
	
	public static void TC01()
	{
		getDriver();
		gotoUrl("https://login.salesforce.com");
		
		//Clear Password field.........................
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		closeDriver();
	}
	
	@Test
	
	public static void TC02()
	{
		//Login code...........................
		getDriver();
		gotoUrl("https://login.salesforce.com");
		login("archana.dhokane@gmail.com","asd@12345");
		closeDriver();
	}
	
@Test
	
	public static void TC03() throws InterruptedException
	{
		getDriver();
		gotoUrl("https://login.salesforce.com");
		
		//remember user name and password........................... 
		driver.findElement(By.id("username")).sendKeys("archana.dhokane@gmail.com");
		driver.findElement(By.id("password")).sendKeys("asd@12345");
		driver.findElement(By.xpath("//input[@id='rememberUn']")).isSelected();
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//check for Username field...............................
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		closeDriver();
	}
@Test

public static void TC04A()
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	
	//Forgot password..................
	driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
	driver.findElement(By.xpath("//input[@id='un']")).sendKeys("archana.dhokane@gmail.com");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	closeDriver();
}

@Test

public static void TC04B()
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	
	//enter wrong username and password...............
	driver.findElement(By.id("username")).sendKeys("123");
	driver.findElement(By.id("password")).sendKeys("22131");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	closeDriver();
}
@Test

public static void TC05()
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//check UserMenu dropdown list..................
	driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	closeDriver();
}

@Test

public static void TC06() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Select My Profile................
	driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
	Thread.sleep(2000);

	//Click on About tab......................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]")).click();
	driver.switchTo().frame("contactInfoContentId");
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")).clear();
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")).sendKeys("ABCD");
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
	
	//Click on post link....................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
	driver.switchTo().frame(0);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body")).sendKeys("TEST DATA");
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).click();
	
	Thread.sleep(1000);
	/*
	 //Click on file link...................................
	 driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click();
	
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	driver.findElement(By.id("chatterUploadFileAction")).click();
	
	//Click on Add photo link....................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/li[1]/div[1]/div[1]/a[1]")).click();
	driver.switchTo().frame("uploadPhotoContentId");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body[1]/span[1]/form[1]/input[2]")).click();
	*/
	closeDriver();
}	

@Test

public static void TC07() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click "My Settings" option from user menu.....................................
	driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
	
	//driver.switchTo().frame(0);
	Thread.sleep(1000);
	//driver.findElement(By.id("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[4]/div[2]/a[1]/span[2]")).click();		
	closeDriver();
}

@Test

public static void TC08()
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click on Developer Console link from the drop down...........................
	driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")).click();
	
	String oldwindow1=driver.getWindowHandle();
	Set<String> getAllWindows1=driver.getWindowHandles();
	String[] getWindow1=getAllWindows1.toArray(new String[getAllWindows1.size()]);
	driver.switchTo().window(getWindow1[1]);
	System.out.println(driver.getCurrentUrl());
	driver.close();
	driver.switchTo().window(oldwindow1);
	System.out.println(driver.getCurrentUrl());
	closeDriver();
}

@Test


public static void TC09() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click on Logout option from the drop down...........................
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	closeDriver();
}
@Test

public static void TC10() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click on Accounts link on the home page..........................
	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	Thread.sleep(1000);
	//Click on the New button to create new account................
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(" //tbody/tr[1]/td[2]/input[1]")).click();
	driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("new account");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	closeDriver();
}

@Test

public static void TC11() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	Thread.sleep(3000);
	
	////Click on the New button to create new account................
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	
	//Click on create new view link on accounts page..................
	driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("new view");
	driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("new_view");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	closeDriver();
}

@Test

public static void TC12() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	////Click on Accounts link on the home page..........................
	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	Thread.sleep(4000);
	
	//Select view name.........................
	WebElement selectView=driver.findElement(By.xpath("//select[@id='fcf']"));
	Select s=new Select(selectView);
	s.selectByVisibleText("new test view");
	
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]")).click();
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/a[1]")).click();
	
	//Edit the view...................
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
	closeDriver();
}

@Test

public static void TC13() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	Thread.sleep(1000);
	
	//Select accounts to merge...................
	driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
	driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("archana");
	
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/input[2]")).click();
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[5]/div[1]/input[1]")).click();
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[2]")).click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	closeDriver();
}
@Test

public static void TC14() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	Thread.sleep(1000);
	
	//Create account report.....................
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
	Thread.sleep(2000);

	//Select report options............................
	driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]")).sendKeys("5/16/2022");
	driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]")).clear();
	driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[4]/input[1]")).sendKeys("5/16/2022");
	driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]")).click();
	
	/*
	 //Save report.........................
	driver.findElement(By.xpath("//body[1]/div[22]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("test report");
	driver.findElement(By.xpath("//body[1]/div[22]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("unique test report");
	driver.findElement(By.xpath("//body[1]/div[22]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]")).click();
	*/
	
	closeDriver();
}
@Test

public static void TC15() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click on opportunities link.....................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/select[1]")).click();
	closeDriver();
}

@Test

public static void TC16() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Click on the New button to create new Opty..............................
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
	closeDriver();
}

@Test

public static void TC17() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Click on Opportunity Pipeline link  ................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
	closeDriver();
}

@Test

public static void TC18() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Click on Stuck Opportunities link  .......................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	closeDriver();
}

@Test

public static void TC19() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Click on Quarterly Summary link  .....................
	WebElement selectSummeryInterval=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/select[1]"));
	Select s=new Select(selectSummeryInterval);
	s.selectByVisibleText("Next FQ");
	
	WebElement selectSummeryInclude=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/select[1]"));
	Select s1=new Select(selectSummeryInclude);
	s1.selectByVisibleText("Open Opportunities");
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")).click();
	closeDriver();
}
@Test

public static void TC20() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click leads tab link from Home Page.......................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	closeDriver();
}

@Test

public static void TC21() throws InterruptedException 
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click leads tab link from Home Page........................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/select[1]")).click();
	closeDriver();
}

@Test

public static void TC22() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	
	//Select 'Todays leads'...........................
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
	closeDriver();
}

@Test

public static void TC23() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	
	//select Todays Leads from the view drop down...............................
	WebElement selectLeadsView=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/select[1]"));
	Select s1=new Select(selectLeadsView);
	s1.selectByVisibleText("Today's Leads");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]")).click();
	closeDriver();
}

@Test

public static void T24() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click leads tab link from Home Page..............................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a")).click();
	
	//enter last name and company name...............
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/input[1]")).sendKeys("ABCD");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/input[1]")).sendKeys("ABCD");
	
	//Click save button............................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	closeDriver();
}
@Test

public static void TC25() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click Contact Tab..................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	
	//enter last name and account name......................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/input[1]")).sendKeys("rajmane");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/span[1]/input[1]")).sendKeys("archana");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	closeDriver();
}

@Test

public static void TC26() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click Contact Tab..................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Click Create new View...............................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[2]/a[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]")).sendKeys("new view1");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")).sendKeys("new_view1");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	closeDriver();
}

@Test

public static void TC27() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click Contact Tab..................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Select recently created .......................
	WebElement selectRecentContact=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/select[1]"));
	Select s=new Select(selectRecentContact);
	s.selectByVisibleText("Recently Created");
	closeDriver();
}

@Test

public static void TC28() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click Contact Tab..................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Select 'My Contacts'....................
	WebElement selectMyContactsView=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/select[1]"));
	Select s=new Select(selectMyContactsView);
	s.selectByVisibleText("My Contacts");
	
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]")).click();
	closeDriver();
}

@Test

public static void TC29() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click Contact Tab..................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Click on a contact name......................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/th[1]/a[1]")).click();
	closeDriver();
}

@Test

public static void TC30() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click on Contacts on the Menu bar.......................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Click on Create New View hyperlink ..............................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[2]/a[2]")).click();
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")).sendKeys("EFGH");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	closeDriver();
}


@Test

public static void TC31() throws InterruptedException
{
	getDriver();
	gotoUrl("https://login.salesforce.com");
	login("archana.dhokane@gmail.com","asd@12345");
	
	//Click on Contacts on the Menu bar.......................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	
	//Contacts: Create New View page......................................
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[2]/a[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]")).sendKeys("ABCD");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")).sendKeys("EFGH");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")).click();
	closeDriver();
}

	@Test
	
public static void TC32() throws InterruptedException
{
		getDriver();
		gotoUrl("https://login.salesforce.com");
		login("archana.dhokane@gmail.com","asd@12345");
	
		//Click on Contacts on the Menu bar.......................
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();

	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/th[1]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[3]")).click();
	
	//Contact Edit: New Contact Page...................................
	Thread.sleep(4000);
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/input[1]")).clear();
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/input[1]")).sendKeys("Indian");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/span[1]/input[1]")).clear();
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/span[1]/input[1]")).sendKeys("Global Media");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")).click();
	closeDriver();
}
@Test
	
	public static void TC33() throws InterruptedException
	{
		getDriver();
		gotoUrl("https://login.salesforce.com");
		login("archana.dhokane@gmail.com","asd@12345");
		
		//Click Home Tab...........................
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		//Verify that the FirstName LastName of the account holder is displayed at the top left hand side of the page, as a link................
		Assert.assertEquals("Archana ABCD",driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).getText());
		System.out.println("Username is same.");
		
		//Click on the FirstName LastName link in the home page............................
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).click();
		
		Assert.assertEquals("https://tekarch-b-dev-ed.my.salesforce.com/_ui/core/userprofile/UserProfilePage?tab=sfdc.ProfilePlatformFeed", driver.getCurrentUrl());
		closeDriver();
	}
	
	@Test
	
	public static void TC34() throws InterruptedException
	{
		getDriver();
		gotoUrl("https://login.salesforce.com");
		login("archana.dhokane@gmail.com","asd@12345");
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		//Click on the 'Edit Profile' icon near Contact.............................
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]")).click();
	
		//Click on the 'About' tab....................................
		Thread.sleep(2000);
		driver.switchTo().frame("contactInfoContentId");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")).sendKeys("ABCD");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Assert.assertEquals("Archana ABCD",driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).getText());
		System.out.println("Verified Updated lastname on Home page..");
		
		//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]")).click();
		Assert.assertEquals("Archana ABCD",driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[1]/span[1]")).getText());
		System.out.println("Verified User menu for Updated lastname..");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[1]/h1[1]/a[1]")).click();
		Assert.assertEquals("Archana ABCD ",driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[2]/span[3]")).getText());
		System.out.println("Verified User page for updated last name..");
		closeDriver();
	}
	
	@Test
	
	public static void TC35() throws InterruptedException
	{
		getDriver();
		gotoUrl("https://login.salesforce.com");
		login("archana.dhokane@gmail.com","asd@12345");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		//Click + tab........................
		driver.findElement(By.className("allTabsArrow")).click();
		Thread.sleep(1000);
		//Click 'Customize My Tabs' button............................
		driver.findElement(By.className("btnImportant")).click();
		
		//Select any tab from the 'Selected Tabs' section and click Remove button....................
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
		closeDriver();
	}
	
	@Test
	
	public static void TC36() throws InterruptedException
	{
		getDriver();
		gotoUrl("https://login.salesforce.com");
		login("archana.dhokane@gmail.com","asd@12345");
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		//Click on the current date link.............................
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[29]/a[1]")).click();
		//driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/a[1]/img[1]")).click();
		Thread.sleep(4000);
		
		//Click on 'Subject Combo' icon...................................
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")).sendKeys("Other");
		
		//Click on the 'End' time field....................................
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("9:00 PM");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("11:30 PM");
		
		//Click Save button.........................
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		closeDriver();
	}

	@Test
	
	public static void TC37() throws InterruptedException
	{
		getDriver();
		gotoUrl("https://login.salesforce.com");
		login("archana.dhokane@gmail.com","asd@12345");
		
		//Click Home Tab.....................................
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		//Click on the current date link.............................
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[21]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/a[1]/img[1]")).click();
		
		////Click on 'Subject Combo' icon...................................
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")).sendKeys("Other");
		
		//Click on the 'End' time field....................................
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("5:00 PM");
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("11:30 PM");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/span[1]/span[1]/input[1]")).sendKeys("7:00 PM");
		
		//Check 'Recurrence'...............................................
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[8]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[8]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[8]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[2]/table[1]/tbody[1]/tr[6]/td[2]")).click();
		
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
	
		
		//driver.findElement(By.cssSelector("body.hasMotif.eventTab.ext-webkit.ext-chrome.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outer td.oRight div.bPageTitle:nth-child(2) div.calendarHeader.calendarHeaderBG span.dwmIcons a:nth-child(3) > img.monthViewIconOn")).click();
		closeDriver();
	}
	


	//public static void main(String[] args) {
		
		//}

}
