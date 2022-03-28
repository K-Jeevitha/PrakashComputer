package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Programifr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		List<WebElement> frame = d.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
	d.switchTo().frame("frame2");
	WebElement animal = d.findElement(By.id("animals"));
		Select s=new Select(animal);
		s.selectByIndex(2);
		d.switchTo().defaultContent();
		d.switchTo().frame("frame1");
		WebElement t = d.findElement(By.xpath("//body//input"));
		t.sendKeys("ABC");
		d.switchTo().frame(0);
		WebElement txtbox = d.findElement(By.id("a"));
		txtbox.click();
		d.switchTo().parentFrame();
		WebElement e = d.findElement(By.xpath("//body//input"));
e.sendKeys("EFG");
		
	}

}
