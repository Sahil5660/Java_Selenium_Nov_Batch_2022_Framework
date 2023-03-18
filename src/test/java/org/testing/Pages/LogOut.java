package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut {
	
	ChromeDriver driver;
	Properties pr;
	public LogOut(ChromeDriver driver,Properties pr) {
	this.driver=driver;
	this.pr=pr;
	}
	public void Signout() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Hamburg2=driver.findElement(By.xpath(pr.getProperty("Hamburg2")));
		Hamburg2.click();
		Thread.sleep(2000);
		WebElement LogOut=driver.findElement(By.xpath(pr.getProperty("LogOut")));
		LogOut.click();
	}

}
