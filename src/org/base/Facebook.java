package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

private void emp() {
	System.out.println("fdfgjh");
	
}private void empName() {
	System.out.println("fghj");
}
	private void employee() {
		System.out.println("fcgjh");


	}
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\mariv\\eclipse-workspace\\SeleniumTask2\\Drive\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
//	
//	WebElement clc = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//    clc.click();
//	
//	WebElement name = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
//	name.sendKeys("Ravichandran");
	
	WebElement add = driver.findElement(By.xpath("//input[@type='password']"));
	add.sendKeys("1234567");
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("krishnaravi6494@gmail.com");
	
	WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
	phone.sendKeys("9585777407");
	
	WebElement gndr = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
	gndr.click();
	
	WebElement hob = driver.findElement(By.xpath("//input[@id='checkbox1']"));
	hob.click();
	
	WebElement hob1 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
	hob1.click();
	
	WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"+"//div[@class='ui-autocomplete-multiselect-item']"));
	lang.click();
	
	
	
		
		
	}

}
