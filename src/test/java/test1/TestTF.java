package test1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTF {

	

		@Test
		public void validUsersShouldBeAbleToLogIn() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		}
		@Test
		public void invalidUsersShouldBeAbleToLogIn() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


