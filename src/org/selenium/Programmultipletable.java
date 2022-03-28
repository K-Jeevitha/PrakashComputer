package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programmultipletable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/write-xpath-table.html");
		d.manage().window().maximize();
		
		
		List<WebElement> alltable = d.findElements(By.tagName("table"));
		System.out.println(alltable.size());
		List<WebElement> alltablerow = d.findElements(By.tagName("tr"));
		System.out.println(alltablerow.size());
		
		for (WebElement allrow : alltablerow) {
			
			//to print the all data in table
			System.out.println(allrow.getText());
			
			//to print the data in row wise order
			List<WebElement> eachrow = allrow.findElements(By.tagName("td"));
			
			for (WebElement eachdatarow : eachrow) {
				System.out.println(eachdatarow.getText());
			}
			
			}
		
		
		List<WebElement> alltabledata = d.findElements(By.tagName("td"));
		System.out.println(alltabledata.size());
		
		for (WebElement alldata : alltabledata) {
			System.out.println(alldata.getText());
		}
		
		
		
		
		
		
	}
	
	
	
	
	

}
