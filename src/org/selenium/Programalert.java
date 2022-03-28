package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programalert {
public static void main(String[] args) throws InterruptedException {
		
		System.out.println("==========Alert=============");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/delete_customer.php");
		d.manage().window().maximize();
		WebElement customerID = d.findElement(By.name("cusid"));
		customerID.sendKeys("1234thyj", Keys.ENTER);
		Alert alert=d.switchTo().alert();
		alert.accept();
		
		String message = alert.getText();
		System.out.println(message);
		alert.accept();
		//Thread.sleep(3000);

		d.get("http://demo.automationtesting.in/Alerts.html");
		d.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		d.findElement(By.xpath("//button[contains(text(), 'click the button to display an')]")).click();
		Alert alert1=d.switchTo().alert();
		alert1.accept();
		Thread.sleep(3000);

		d.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		d.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		alert1.dismiss();
		d.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		d.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		alert1.sendKeys("Alertbox");
		
		Thread.sleep(3000);
		alert1.accept();
		
		 }
}
