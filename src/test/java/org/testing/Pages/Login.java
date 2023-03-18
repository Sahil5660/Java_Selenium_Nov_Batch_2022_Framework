package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	
	public Login(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}

	
	public void SignIn(String User,String Password) throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement SignIn=driver.findElement(By.xpath(pr.getProperty("SignIn")));
		SignIn.click();
		
		Thread.sleep(2000);
		WebElement Email=driver.findElement(By.xpath(pr.getProperty("Email")));
		Email.sendKeys(User);
		Thread.sleep(2000);
		WebElement Next1=driver.findElement(By.xpath(pr.getProperty("Next1")));
		Next1.click();
		Thread.sleep(4000);
		WebElement password=driver.findElement(By.xpath(pr.getProperty("Password")));
	    password.sendKeys(Password);
	}
}
