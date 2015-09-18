package FistTestSelenium;

import org.junit.Assert; 
import org.junit.Test; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumDriverTest {
	
	
@Test
public void startWebDriver () {
	
	WebDriver driver = new FirefoxDriver();
	
	//driver.navigate().to("http://facebook.com");
	//driver.close();
	
	driver.get("http://www.facebook.com");  
    String title = driver.getTitle();                
    Assert.assertTrue(title.contains("kbnkkbb"));
}
	
	

}
