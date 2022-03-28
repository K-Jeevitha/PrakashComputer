package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programtableclick {
	
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get("https://letcode.in/table");
			d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			d.manage().window().maximize();
			List<WebElement> allrow = d.findElements(By.xpath("//table[@id='simpletable']//tbody/tr"));
			for (int i = 0; i < allrow.size(); i++) {
				
				WebElement wrow = allrow.get(i);
				
				List<WebElement> cdata = wrow.findElements(By.tagName("td"));
				WebElement c1 = cdata.get(1);
				String text = c1.getText();
				System.out.println(text);
				
				if(text.equalsIgnoreCase("Man")) {
					WebElement input = cdata.get(3).findElement(By.xpath("//input[@id='third']"));
					
					input.click();
					
				}
				}
				}
				}


