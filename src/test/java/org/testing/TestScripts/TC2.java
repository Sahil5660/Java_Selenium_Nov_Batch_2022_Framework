package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Assertions.SoftAssertion;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends Base {
	
	//To click on History button

	@Test
	public void TestCase2() throws InterruptedException {
		//I am checking below by giving wrong YouTube URL since I wanted to soft assertion failed
		String Expected="https://www.you";
		SoftAssertion.softAssertion(driver.getCurrentUrl(), Expected, "TestCase2");
		Login log=new Login(driver, pr);
		log.SignIn("Selenium88888@gmail.com", "Test@123");
		
	    HomePage home=new HomePage(driver, pr);
	    home.ClickHistory(); 
	   
	    
	    LogOut out=new LogOut(driver, pr);
		out.Signout();
		
		
	}
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
	    Password.sendKeys("Test@123");
	    Thread.sleep(2000);
	    WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
	    Next2.click();
	    Thread.sleep(2000);
	    WebElement Hamburg=driver.findElement(By.xpath(pr.getProperty("Hamburg")));
	    Hamburg.click();
	    Thread.sleep(2000);
	    WebElement History=driver.findElement(By.xpath(pr.getProperty("History")));
	    History.click();
	    Thread.sleep(4000);
		WebElement Hamburg2=driver.findElement(By.xpath(pr.getProperty("Hamburg2")));
		Hamburg2.click();
		Thread.sleep(2000);
		WebElement LogOut=driver.findElement(By.xpath(pr.getProperty("LogOut")));
		LogOut.click();
		
	}*/
	
}
