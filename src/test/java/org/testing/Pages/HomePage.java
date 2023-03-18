package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	ChromeDriver driver;
	Properties pr;
	public HomePage(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
	}
	
	public void TrendingClick() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
	    Next2.click();
	    Thread.sleep(3000);
	    WebElement Hamburg=driver.findElement(By.xpath(pr.getProperty("Hamburg")));
	    Hamburg.click();
	    Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",Comment);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(4000);
		WebElement Trending=driver.findElement(By.xpath(pr.getProperty("Trending")));
		Trending.click();
		
	}
	
	public void ClickHistory() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
	    Next2.click();
	    Thread.sleep(4000);
	    WebElement Hamburg=driver.findElement(By.xpath(pr.getProperty("Hamburg")));
	    Hamburg.click();
	    Thread.sleep(2000);
		WebElement History=driver.findElement(By.xpath(pr.getProperty("History")));
	    History.click();
	}
	
	public void SubscriptionClick() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
	    Next2.click();
	    Thread.sleep(4000);
	    WebElement Hamburg=driver.findElement(By.xpath(pr.getProperty("Hamburg")));
	    Hamburg.click();
	    Thread.sleep(2000);
	    WebElement Subscription=driver.findElement(By.xpath(pr.getProperty("Subscription")));
	    Subscription.click();
	}
	public void videoLike() throws InterruptedException {
		
	    Thread.sleep(2000);
	    WebElement Like=driver.findElement(By.xpath(pr.getProperty("Like")));
	    Like.click();
	}
	
	public void SubScribe() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement Subscribe=driver.findElement(By.id(pr.getProperty("Subscribe")));
	    Subscribe.click();
	}
	
	public void commentVideo() throws InterruptedException {
		Thread.sleep(2000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(6000);
		WebElement Comment=driver.findElement(By.xpath(pr.getProperty("Comment")));
		Thread.sleep(6000);
		Comment.click();
		Thread.sleep(2000);
		WebElement SendKeys=driver.findElement(By.xpath(pr.getProperty("SendKeys")));
		SendKeys.sendKeys("Nice Video");
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath(pr.getProperty("submit")));
		submit.click();
	}
	
	public void watchLater() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
	    Next2.click();
	    Thread.sleep(2000);
	    WebElement Hamburg=driver.findElement(By.xpath(pr.getProperty("Hamburg")));
	    Hamburg.click();
		Thread.sleep(2000);
	    WebElement WatchLater=driver.findElement(By.xpath(pr.getProperty("WatchLater")));
	    WatchLater.click();
	}
	public void Library() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement Next2=driver.findElement(By.xpath(pr.getProperty("Next2")));
	    Next2.click();
	    Thread.sleep(2000);
	    WebElement Hamburg=driver.findElement(By.xpath(pr.getProperty("Hamburg")));
	    Hamburg.click();
	    Thread.sleep(2000);
	    WebElement Library=driver.findElement(By.xpath(pr.getProperty("Library")));
	    Library.click();
	}
}
