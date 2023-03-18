package org.testing.TestScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LogOut;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5 extends Base {
	//Video Play+Subscribe Button
	
		@Test
		public void TestCase5() throws InterruptedException {
			Login log=new Login(driver, pr);
			log.SignIn("Selenium88888@gmail.com", "Test@123");
			
			VideoPlay video=new VideoPlay(driver, pr);
			video.playVideo();
			
			HomePage home=new HomePage(driver, pr);
		    home.SubScribe();
		    
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
			Thread.sleep(4000);
			WebElement Password=driver.findElement(By.xpath(pr.getProperty("Password")));
		    Password.sendKeys("Test@123");
		    Thread.sleep(2000);
		    WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
		    Next2.click();
		    Thread.sleep(4000);
		    WebElement Video=driver.findElement(By.id(pr.getProperty("Video")));
		    Video.click();
		    Thread.sleep(2000);
		    WebElement Subscribe=driver.findElement(By.id(pr.getProperty("Subscribe")));
		    Subscribe.click();
		    Thread.sleep(4000);
			WebElement Hamburg2=driver.findElement(By.xpath(pr.getProperty("Hamburg2")));
			Hamburg2.click();
			Thread.sleep(2000);
			WebElement LogOut=driver.findElement(By.xpath(pr.getProperty("LogOut")));
			LogOut.click();
			
		}
	*/	
	}
