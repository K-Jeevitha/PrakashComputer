package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programjavascript {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		JavascriptExecutor executor=(JavascriptExecutor) d;
		
		WebElement user = d.findElement(By.id("email"));
		WebElement pass = d.findElement(By.id("pass"));
	WebElement btn = d.findElement(By.name("login"));
	executor.executeScript("arguments[0].setAttribute('value', 'Jeevitha')", user);
		executor.executeScript("arguments[0].setAttribute('value', '12345')", pass);
		executor.executeScript("arguments[0].setAttribute('value','Greens')", btn);
		
		//to get the attribute
		
		Object obj1 = executor.executeScript("return arguments[0].getAttribute('value')", user);
		
	System.out.println(obj1);
	Object obj2 = executor.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(obj2);
		
		WebElement txt = d.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		Object obj3 = executor.executeScript("return arguments[0].innerHTML", txt);
		System.out.println(obj3);
		
		executor.executeScript("arguments[0].click()", btn);
		
		System.out.println("==========================Scrolldown Javascript======================");
		
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		WebElement scroll = d.findElement(By.xpath("//h2[contains(text(),'Comfy')]"));
		executor.executeScript("arguments[0].scrollIntoView()", scroll);
		
	//	Thread.sleep(3000);
		
		
		TakesScreenshot ts=(TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\prakash\\Desktop\\Jeevitha\\amazon1.jpeg");
		
		FileUtils.copyFile(temp, des);
		
		
		
		
		WebElement scroll1 = d.findElement(By.xpath("//h2[contains(text(),'Health &')]"));
		executor.executeScript("arguments[0].scrollIntoView()", scroll1);
		
		//Thread.sleep(3000);
		File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File des1=new File("C:\\Users\\prakash\\Desktop\\Jeevitha\\amazon2.jpeg");
		
		FileUtils.copyFile(temp1, des1);
		
		}

}
