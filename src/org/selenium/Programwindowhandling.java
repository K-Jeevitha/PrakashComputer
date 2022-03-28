package org.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		
		String firstwindow = d.getWindowHandle();
	System.out.println(firstwindow);
		WebElement search = d.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Saree",Keys.ENTER);
		d.findElement(By.xpath("//span[contains(text(),'Rama Color Khadi Silk Saree')]")).click();
		Set<String> all = d.getWindowHandles();
		System.out.println(all);
		for (String secondwindow : all) {
			if(!firstwindow.equals(secondwindow)) {
				d.switchTo().window(secondwindow);
				}
				}
				
			d.findElement(By.id("add-to-cart-button")).click();
			
			System.out.println("===========single window over==============");
			d.switchTo().window(firstwindow);
			d.findElement(By.xpath("//span[contains(text(),'womens kanjivaram pure banarasi silk saree')]")).click();
			Set<String> thirdwindow = d.getWindowHandles();
			
			System.out.println(thirdwindow);
			
			List<String> l=new ArrayList<String>(thirdwindow);
			
			String tab = l.get(2);
			d.switchTo().window(tab);
			d.findElement(By.id("add-to-cart-button")).click();
			d.switchTo().window(firstwindow);
			d.findElement(By.xpath("//span[contains(text(),'Net Sarees (TI1865_Pink)')]")).click();
			Set<String> fourthwindow = d.getWindowHandles();
			System.out.println(fourthwindow);
			List<String> l1=new ArrayList<String>(fourthwindow);
			String tab1 = l1.get(3);
			d.switchTo().window(tab1);
			d.findElement(By.id("add-to-cart-button")).click();
			
			
			
			
	}

}
