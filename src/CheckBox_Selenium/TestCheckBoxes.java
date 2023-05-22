package CheckBox_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class TestCheckBoxes {
	
	BaseClass bc;
	WebDriver driver;
	
	@Test
	public void FBLaunch() {
		
		bc = new BaseClass(driver);
		driver = bc.browserLaunch("Chrome");
		driver.get("file:///C:/Users/UD20461958/OneDrive%20-%20Wipro/Desktop/chekcbox.html");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@name='option1']")).click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='option1']"));
		checkbox.click();
		
		if (checkbox.isSelected()) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
			
		} 
		checkbox.click();
		
		if (!checkbox.isSelected()) {
			System.out.println("Checkbox is toggle	off....!!");
		}
		
	}
}
