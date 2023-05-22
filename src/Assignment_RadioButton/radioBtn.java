package Assignment_RadioButton;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class radioBtn {
	
	BaseClass bc;
	WebDriver driver;
	
	@Test
	public void SeleniumPractise() throws InterruptedException {
		
		bc = new BaseClass(driver);
		driver = bc.browserLaunch("Chrome");
		driver.navigate().to("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(10000);
		
		Alert al = driver.switchTo().alert();
		
		String alertText = al.getText();
		System.out.println("Text presents on the alert box is: " + alertText);
		
		al.accept();
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
}
