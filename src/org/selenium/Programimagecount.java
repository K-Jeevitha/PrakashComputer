package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programimagecount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		int count = 0;
		List<WebElement> image = d.findElements(By.tagName("img"));
		
		System.out.println(image.size());
	for (WebElement allimage :image) {
		
		if(allimage.isDisplayed()) {
			count++;
			System.out.println(allimage.getAttribute("alt"));
			
			
		}
		
	}
	
		System.out.println("Total number of display images:"+ count);
	}

}
