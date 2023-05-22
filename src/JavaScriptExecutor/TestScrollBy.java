package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Utilities.BaseClass;


public class TestScrollBy {

	WebDriver driver;
	String url = "http://spicejet.com";
	BaseClass bc;

	@Test
	public void test() throws InterruptedException {

		bc = new BaseClass(driver);
		driver =bc.browserLaunch("Chrome");
		driver.get(url);
		((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
		Thread.sleep(6000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-800)","");

	}
}