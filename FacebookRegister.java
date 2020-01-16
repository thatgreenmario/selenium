package tester;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dac\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		 driver.navigate().to("http://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.findElement(By.name("firstname")).sendKeys("john");
		driver.findElement(By.name("lastname")).sendKeys("williams");
		driver.findElement(By.name("reg_email__")).sendKeys("polliwog@quuradminb.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("polliwog@quuradminb.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password123!@#A");
		
		
		driver.findElement(By.id("day")).sendKeys("6");
		driver.findElement(By.id("month")).sendKeys("Nov");
		driver.findElement(By.id("year")).sendKeys("2000");
		
		//WebElement radio1 = driver.findElement(By.id("u_0_7"));
		//radio1.click();
		
		//driver.findElement(By.name("sex")).sendKeys("2");

		 driver.findElement(By.id("u_0_7")).click();
		
		driver.findElement(By.name("websubmit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (driver.getCurrentUrl().contains("https://www.facebook.com/checkpoint/block/?"))
		//if(driver.getPageSource().contains("https://www.facebook.com/checkpoint/block/?"))
			System.out.println("Test Pass");
		else
			System.out.println("Test Failed");
		
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
