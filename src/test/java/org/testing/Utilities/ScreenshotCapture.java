package org.testing.Utilities;

import java.io.File;
import java.io.IOException;
import java.security.cert.Extension;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Function;

public class ScreenshotCapture {
	
	public static void takeScreenshot(ChromeDriver driver,String path) throws IOException {
		File f=driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File(path));		
		
	}
	
}
