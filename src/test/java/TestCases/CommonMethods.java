package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class CommonMethods {

	public static WebDriver driver;
	public static LoginPage login;
	

	@BeforeTest
	public void setup() throws InterruptedException {
		
		// 1. Add relative path for driver
		// 2. Add similar path for Egde and Firefox
		// 3. Read browser property path from property file
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\Eclipse\\Flipkart\\src\\test\\resources\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
	}

	@AfterTest
	public void logout() throws InterruptedException {
		
		driver.quit();
	}
	

}
