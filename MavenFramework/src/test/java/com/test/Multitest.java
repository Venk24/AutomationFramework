package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multitest {
	
	WebDriver driver;

	@BeforeClass
	public void Initalization() throws InterruptedException {

		 driver = new ChromeDriver(); // rtp //open the browser

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize(); // browser will maximized
		
		Thread.sleep(4000);
	}

	@Test(priority = 1)
	public void SelectDropDown() {

		WebElement selectdropdownOption = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(selectdropdownOption);

		sel.selectByIndex(3);

		sel.selectByValue("search-alias=beauty");

		sel.selectByVisibleText("Electronics"); // best option

	}

	@Test(priority = 2)
	public void AdvanceDropDown() {
		

		WebElement selectdropdownOption = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(selectdropdownOption);

		List<WebElement> li = sel.getOptions();

		System.out.println(li.size());

		for (int i = li.size() - 1; i >= 0; i--) {
			li.get(i).click();
			System.out.println(li.get(i).getText());
		}

	}

	@AfterClass
	public void Cleanup() {
		driver.quit();
	}

}
