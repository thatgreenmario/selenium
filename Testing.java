import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class Testing {
	@Test
	  public void testGoogleSearch() throws InterruptedException {
	    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\oj169\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    Thread.sleep(5000);  // Let the user actually see something!
	    WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("maxbleed");
	    
	    WebElement pass = driver.findElement(By.id("pass"));
	    pass.sendKeys("pirate");
	    
	    pass.submit();
		/* searchBox.submit(); */
	    Thread.sleep(5000);  // Let the user actually see something!
	    driver.quit();
}
}
