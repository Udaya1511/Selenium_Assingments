package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class FacebookID {
	
	BaseClass bc;
	WebDriver driver;
	
	@Test
	public void FBLaunch() {
		
		bc = new BaseClass(driver);
		driver = bc.browserLaunch("Chrome");
		driver.get("https://www.facebook.com/campaign/landing.php?");
		driver.manage().window().maximize();
		
		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select monthDD = new Select(month_Dropdown);
		
		monthDD.selectByIndex(3);
		monthDD.selectByValue("9");
		monthDD.selectByVisibleText("Sep");
		
	}

}
