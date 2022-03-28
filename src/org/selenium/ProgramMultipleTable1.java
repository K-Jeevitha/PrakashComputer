package org.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramMultipleTable1 {

	@SuppressWarnings({ "unused", "deprecation" })
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://letcode.in/table");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
WebElement table = d.findElement(By.id("simpletable"));
List<WebElement> tableheader = table.findElements(By.tagName("th"));

for (WebElement tableheaderdata : tableheader) {
	System.out.println(tableheaderdata.getText());
}
System.out.println();
List<WebElement> allrow = table.findElements(By.xpath("//table[@id='simpletable']//tbody//tr"));

for (WebElement eachrow : allrow) {
	
	List<WebElement> eachdatainrow = eachrow.findElements(By.tagName("td"));
	System.out.println(eachdatainrow.get(0).getText());
	
}

for (int i = 0; i < allrow.size(); i++) {
	WebElement wRow = allrow.get(i);
	List<WebElement> cData = wRow.findElements(By.tagName("td"));
	WebElement c1= cData.get(1);
String text = c1.getText();
    if(text.equals("Iron")) {
   WebElement check = cData.get(3).findElement(By.tagName("input"));
    check.click();
    
    }
}

	}}
