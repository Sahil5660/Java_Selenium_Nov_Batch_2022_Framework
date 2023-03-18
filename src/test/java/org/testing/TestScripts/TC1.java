 package org.testing.TestScripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testing.Utilities.ScreenshotCapture;
import org.testing.Utilities.logsCapture;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends Base {
	//To click on Trending button
	
	
	@Test
	public void TestCase1() throws InterruptedException, IOException {
		//ExtentTest test = reports.startTest("TestCase1");
		/*Thread.sleep(2000);
		WebElement SignIn=driver.findElement(By.xpath(pr.getProperty("SignIn")));
		SignIn.click();
		
		Thread.sleep(2000);
		WebElement Email=driver.findElement(By.xpath(pr.getProperty("Email")));
		Email.sendKeys("selenium88888@gmail.com");
		Thread.sleep(2000);
		WebElement Next1=driver.findElement(By.xpath(pr.getProperty("Next1")));
		Next1.click();
		Thread.sleep(2000);
		WebElement Password=driver.findElement(By.xpath(pr.getProperty("Password")));
	    Password.sendKeys("Test@123");*/
		Login log=new Login(driver, pr);
		log.SignIn("Selenium88888@gmail.com", "Test@123");
		
		logsCapture.CaptureLogs("TC1", "Login sucessfully for the TC1");
		Calendar cal=Calendar.getInstance(); //code to get a new screenshot with data and time everytime and not append
		Date time=cal.getTime();
		String timestamp=time.toString().replace(":", "").replace(" ", "");
		ScreenshotCapture.takeScreenshot(driver,"D:/Java_Automation Tool/Screenshots/TC1"+timestamp+".png");
		//ScreenshotCapture.takeScreenshot(driver,"D:/Java_Automation Tool/Screenshots/TC1.png"); 
		//In this case if we are using same code again at another place so it would get new one due to append and previous one will lost
		
	    
	    HomePage home=new HomePage(driver, pr);
	    home.TrendingClick();
	    ScreenshotCapture.takeScreenshot(driver,"D:/Java_Automation Tool/Screenshots/TC1"+timestamp+".png");
	   //Below are the hard assertion if its get failed so code will not execute further
	    String ExpectedURL="https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl";
		Assert.assertEquals(driver.getCurrentUrl(), ExpectedURL);
	    /*WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
	    Next2.click();
	    Thread.sleep(2000);
	    WebElement Hamburg=driver.findElement(By.xpath(pr.getProperty("Hamburg")));
	    Hamburg.click();
	    Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",Comment);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(4000);
		WebElement Trending=driver.findElement(By.xpath(pr.getProperty("Trending")));
		Trending.click();*/
		/*Thread.sleep(2000);
		WebElement Hamburg2=driver.findElement(By.xpath(pr.getProperty("Hamburg2")));
		Hamburg2.click();*/
		/*Thread.sleep(2000);
		WebElement LogOut=driver.findElement(By.xpath(pr.getProperty("LogOut")));
		LogOut.click();*/
		LogOut out=new LogOut(driver, pr);
		out.Signout();
		
		
		//test.log(LogStatus.PASS, "Status Code is matching with the expected status code");

		//test.log(LogStatus.FAIL, "Test Failed");
		//reports.endTest(test);
		//reports.flush();
	}
	

}
