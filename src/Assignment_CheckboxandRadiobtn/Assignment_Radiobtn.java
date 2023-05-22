package Assignment_CheckboxandRadiobtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class Assignment_Radiobtn {
	
	BaseClass bc;
	WebDriver driver;
	
	@Test
	public void checkboxlist() throws InterruptedException {
		
		bc = new BaseClass(driver);
		driver = bc.browserLaunch("Chrome");
		driver.navigate().to("file:///C:/Users/UD20461958/OneDrive%20-%20Wipro/Desktop/Checkboxes.html");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxlist = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int checkBoxsize = checkboxlist.size();
		System.out.println("Total Check box are available in the application is: " + checkBoxsize);
		
		for (WebElement checklist : checkboxlist) {
			checklist.click();
			Thread.sleep(2000);
			if (!checklist.isSelected()) {
				checklist.click();
			}
			
		}
		
		
	}
	
	@Test
	public void radioButtonList() throws InterruptedException {
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		int radiosize = radioButtons.size();
		System.out.println("Total radio buttons available in the application is: " + radiosize);
		
		for (WebElement rd : radioButtons) {
			rd.click();
			Thread.sleep(2000);
			
			if (!rd.isSelected()) {
				rd.click();
			}
			
		}	
		
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}
