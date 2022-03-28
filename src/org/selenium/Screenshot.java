package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		
		//Take a screenshot for full page
		TakesScreenshot screenshot=(TakesScreenshot) d;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\prakash\\Desktop\\Jeevitha\\flipkart.png");
		FileUtils.copyFile(src, f);
		//To take a screenshot for particular element
		WebElement login = d.findElement(By.className("_1_3w1N"));
		File loginscreenshot = login.getScreenshotAs(OutputType.FILE);
		File e=new File("C:\\Users\\prakash\\Desktop\\Jeevitha\\login.png");
		FileUtils.copyFile(loginscreenshot, e);
	}
	
	
	
}
