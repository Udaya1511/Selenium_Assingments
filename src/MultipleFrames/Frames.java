package MultipleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;

public class Frames {
	
	WebDriver driver;
	String url = "file:///C:/Users/UD20461958/OneDrive%20-%20Wipro/Desktop/!DOCTYPE.html";
	BaseClass bc;

	@Test
	public void test() throws InterruptedException {

		bc = new BaseClass(driver);
		driver =bc.browserLaunch("Chrome");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		int totalNumofFrames = driver.findElements(By.tagName("iframes")).size();
		System.out.println(totalNumofFrames);
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=eastcalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("9941678198");
		driver.findElement(By.id("log_password")).sendKeys("udaya@123");
		driver.findElement(By.xpath("//input[contains(@name,'log_submit')]")).click();
		
		driver.navigate().to(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//html/body/a")).click();
		
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
		Thread.sleep(3000);
		driver.navigate().to(url);
		
		driver.switchTo().frame("My Store");
		driver.navigate().to("https://demo.opencart.com/");
		driver.findElement(By.name("search")).sendKeys("product");
		driver.findElement(By.name("/html/body")).click();
		driver.quit();
		
		
		
	}
		
}
