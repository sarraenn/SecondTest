package FistTestSelenium;

import org.junit.Test; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumDriverTest {
	
	
@Test
public void startWebDriver () {
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://facebook.com");  
    String title = driver.getTitle();                
    Assert.assertTrue(title.contains("Facebook"));
}
	
	

}
