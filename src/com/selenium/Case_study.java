package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Case_study {
WebDriver driver;
	
	@BeforeTest
	public void launchbrowser() { 
System.setProperty("webdriver.chrome.driver","C:\\driver99999\\chromedriver.exe");
driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");	
		}

	@Test
	public void Signup() {
	driver.findElement(By.linkText("SignUp")).click();
	driver.findElement(By.name("userName")).sendKeys("Lalitha");
	driver.findElement(By.name("firstName")).sendKeys("Lalitha");
	driver.findElement(By.name("lastName")).sendKeys("gupta");
	driver.findElement(By.name("password")).sendKeys("password123");
	driver.findElement(By.xpath("//input[@value]")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("Lalitha@yahoo.com");
	driver.findElement(By.name("mobileNumber")).sendKeys("9765783456");
	driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img)")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a]")).click();
	}
}
	
