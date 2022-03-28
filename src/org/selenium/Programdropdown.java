package org.selenium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Programdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakash\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement dd = d.findElement(By.xpath("//a[text()='Create New Account']"));
		dd.click();
		Thread.sleep(3000);
		System.out.println("===============Print all the text options in year====");
		WebElement year = d.findElement(By.id("year"));
		Select s=new Select(year);
		List<WebElement> options = s.getOptions();
		Set<String> dupl=new TreeSet<>();
		System.out.println("=========Duplicate find in year================");
		
for (WebElement y : options) {
	dupl.add(y.getText());}
if(dupl.size()==options.size()) {
	System.out.println("Duplicate not found in year");
	}else {
		System.out.println("Duplicate found in yeaar");
	}
System.out.println("Size of year :"+options.size());
		
		System.out.println("==========print all the options texxt in year==========");
		for(int i=0;i<=117;i++) {
			System.out.println(options.get(i).getText());
			}
		
	System.out.println("=============print the attribute options in days========");
		WebElement day = d.findElement(By.id("day"));
		Select s1=new Select(day);
		List<WebElement> options2 = s1.getOptions();
		
		System.out.println("Size of days:"+options2.size());
		for (int i = 0; i <=30; i++) {
			System.out.println(options2.get(i).getAttribute("value"));
			}
		System.out.println("=======Month===========");
		WebElement month = d.findElement(By.id("month"));
		Select s2=new Select(month);
		List<WebElement> options3 = s2.getOptions();
		System.out.println("Size of month :"+options3.size());
		
		System.out.println("====Dupliate find in month======");
		Set<String> duplicatechk=new HashSet<String>();
		for (WebElement w : options3) {
			duplicatechk.add(w.getText());
		}
		if(duplicatechk.size()==options3.size()) {
			System.out.println("No duplicate present in month");
		}else {
			System.out.println("duplicate present in month");
		}
		
		
		
		System.out.println("======print the last 5 options text in month========");
	//	for (int i = 7; i <=options3.size()-1; i++) {
		//	System.out.println(options3.get(i).getText());
		//}
		
		for (int i = 0; i <=options3.size()-1; i++) {
			
			
			if(i>=7) {
			System.out.println("Last 5 months text :"+options3.get(i).getText());
		}else if(i<=4)
		{
			System.out.println("First 5 months text :"+options3.get(i).getText());

		}else if(i==5 || i==6) {
			System.out.println("Middle of the month text :"+options3.get(i).getText());
}if(i%2==0){
	System.out.println("Alternate months text :"+options3.get(i).getText());

}
		
		}

		}
}
