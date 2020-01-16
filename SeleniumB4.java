import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;


public class UserTestSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dac\\Desktop\\abcd\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.navigate().to("http://localhost:8080/httpsessionlogin/login.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String username="anyname";
		String password="anypass";
		driver.findElement(By.name("name")).sendKeys(username);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys(password);
		pass.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Testing Login Page
		if(driver.getCurrentUrl().contains("http://localhost:8080/httpsessionlogin/LoginServlet")) {
			System.out.println("User Test Authentication Pass");
			driver.navigate().to("http://localhost:8080/httpsessionlogin/ProfileServlet");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			WebElement profile=driver.findElement(ByLinkText.linkText("Profile"));
			profile.click();
			//Testing Profile Page
			if(driver.getCurrentUrl().contains("http://localhost:8080/httpsessionlogin/ProfileServlet")) {
				System.out.println("Profile Testing Page Success");
			}
			else {
				System.out.println("Profile Testing Page Failed");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Testing Logout Page
			WebElement logout=driver.findElement(ByLinkText.linkText("Logout"));
			logout.click();
			if(driver.getCurrentUrl().contains("http://localhost:8080/httpsessionlogin/LogoutServlet")) {
				System.out.println("Logout page Testing Success");
			}
			else {
				System.out.println("Logout Testing Page Failed");
			}
		}
		
		else
			System.out.println("User Test Failed");

	}

}
