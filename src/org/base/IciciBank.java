package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mariv\\eclipse-workspace\\SeleniumTask2\\Drive\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		search.sendKeys("i phone");
		
		WebElement clc = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		clc.click();
		
		
//		
				
		
	
}

}






