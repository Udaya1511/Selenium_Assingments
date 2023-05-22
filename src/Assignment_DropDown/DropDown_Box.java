package Assignment_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class DropDown_Box {
	
	BaseClass bc;
	WebDriver driver;
	
	@Test
	public void FBLaunch() {
		
		bc = new BaseClass(driver);
		driver = bc.browserLaunch("Chrome");
		driver.navigate().to("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		
		WebElement currenctdrpdown = driver.findElement(By.xpath("//select[@name='fromcur']"));
		
		Select currencydr = new Select(currenctdrpdown);
		currencydr.selectByVisibleText("INR");
		
		List<WebElement> Droplist = currencydr.getOptions();
		
		for (WebElement Dl : Droplist) {
			System.out.println(Dl.getText());
			
		}
		
	}
	
	@Test
	public void verifyTitle() {
		bc.titleVerify("Free Online Math Calculator and Converter");

	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
}
