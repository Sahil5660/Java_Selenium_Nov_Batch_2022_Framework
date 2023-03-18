package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
	ChromeDriver driver;
	Properties pr;
	public VideoPlay(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	public void playVideo() throws InterruptedException {
		Thread.sleep(3000);
	    WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
	    Next2.click();
		 Thread.sleep(3000);
		 WebElement Video=driver.findElement(By.id(pr.getProperty("Video")));
		 Video.click();
		
		
	}

}
