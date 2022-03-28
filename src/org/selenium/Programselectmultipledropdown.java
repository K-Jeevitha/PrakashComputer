package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Programselectmultipledropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://output.jsbin.com/osebed/2");
		WebElement fruit = d.findElement(By.id("fruits"));
		Select s=new Select(fruit);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		Thread.sleep(2000);
		s.selectByValue("apple");
		Thread.sleep(2000);
		s.selectByVisibleText("Banana");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByIndex(3);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());		
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement w : allSelectedOptions) {
			System.out.println(w.getText());
			Thread.sleep(2000);
			s.deselectByIndex(3);
			Thread.sleep(2000);
			s.deselectAll();
			
			
			
		}
		
		
		
	}
	
	
}
