package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Programdropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement dd = d.findElement(By.xpath("//a[text()='Create New Account']"));
		dd.click();
		Thread.sleep(3000);
		System.out.println("===============Print all the text options in year without using selector====");
		WebElement year = d.findElement(By.id("year"));
		
		System.out.println(year.getText());
		
		System.out.println("===============Print all the text options in day without using selector====");
		Thread.sleep(3000);
		WebElement day = d.findElement(By.id("day"));
System.out.println(day.getText());
System.out.println("===============Print all the text options in month without using selector====");
Thread.sleep(3000);
WebElement month = d.findElement(By.id("month"));
System.out.println(month.getText());


Select s=new Select(month);
//s.selectByIndex(11);
System.out.println(s.getOptions().get(11).getText());





	}

}
