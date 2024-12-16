package com.test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class multipletests2 {
	WebDriver driver;
	
	@BeforeMethod
	public void initialistaion() {
	    driver =new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();	
	}
	

	@Test
	public void Test1() 
	{
		
		WebElement countrydropdown = driver.findElement(By.name("country"));
		Select Sel = new Select(countrydropdown);
		List <WebElement> dr = Sel.getOptions();
		{System.out.println(dr.size());
		}
		for(int i= 0; i<dr.size();i++)
		{dr.get(i).click();
		{System.out.println(dr.get(i).getText());
		}
		}
		Sel.selectByValue("INDIA");	
		//driver.quit();
	}
	
	@Test
	public void Test2()
	{
		
		
		driver.findElement(By.name("email")).sendKeys("gjjj@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pwd123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Pwd123");
		driver.findElement(By.name("submit")).click();
//		Actions act = new Actions(driver);
//		Alert alrt = driver.switchTo().alert();
//		System.out.println(alrt.getText());
//		alrt.accept();
//		System.out.println(alrt.getText());
//		alrt.accept();
//		driver.findElement(By.name("cusid")).sendKeys("jkkjhl");
//		driver.findElement(By.name("submit")).click();
//		System.out.println(alrt.getText());
//		alrt.dismiss();
		//driver.quit();
	}

@AfterMethod
public void cleanup() {
driver.quit();
}}
