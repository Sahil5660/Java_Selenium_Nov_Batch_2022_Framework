package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;
	//static String BrowserName;
	
	//public ExtentReports reports;
	@BeforeMethod
	public void BeforeMethod() throws IOException {
		ChromeOptions op=new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "../YT_Framework_Nov2022Batch/chromedriver.exe");
	     driver=new ChromeDriver(op);
	     op.addArguments("--disable-notifications---");
	     driver.get("https://www.youtube.com/");
	     driver.manage().window().maximize();
	     File f=new File("../YT_Framework_Nov2022Batch/Object.Properties");
	     FileInputStream fi=new FileInputStream(f);
	     pr=new Properties();
	     pr.load(fi);
	/*     BrowserName=pr.getProperty("BrowserName");
	     if(BrowserName.equalsIgnoreCase("Chrome")) {
	    	 System.setProperty("webdriver.chrome.driver", "../YT_Framework_Nov2022Batch/chromedriver.exe");
	    	 driver = new ChromeDriver();
				
			} else if (BrowserName.equalsIgnoreCase("Firefox")) {

				System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();


			} else if (BrowserName.equalsIgnoreCase("IE")) {
	          Please set the property if you want to execute on IE
				driver = new InternetExplorerDriver();


			} else {
				throw new Exception("Invalid Browser Name");
			}

			return driver;

	     }*/
	     
	    //reports = new ExtentReports("D:\\Java Videos _Deepak\\Day 28\\Extent Report", false);
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
		System.out.println("Closing browser");
	}

}
