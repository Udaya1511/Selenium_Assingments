package Assignement_FaceBookDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class FB_DropDown {
	
	BaseClass bc;
	WebDriver driver;
	
	@Test
	public void FBLaunch() {
		
		bc = new BaseClass(driver);
		driver = bc.browserLaunch("Chrome");
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		

	}
	
	@Test
	public void verifyTitle() {
		bc.titleVerify("Facebook – log in or sign up");

	}
	
	@Test
	public void printDropdown() throws InterruptedException {
		driver.findElement(By.xpath("//a[@role='button' and text()='Create new account']")).click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select Day = new Select(day);
		Select Month = new Select(month);
		Select Year = new Select(year);
		
		String dayis = Day.getFirstSelectedOption().getText();
		String monthis = Month.getFirstSelectedOption().getText();
		String yearis = Year.getFirstSelectedOption().getText();
		
		System.out.println("Date of Birth is : " + dayis +" - "+ monthis +" - "+ yearis);
		
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
}
