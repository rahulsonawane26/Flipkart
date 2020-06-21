package PageObject;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestCases.CommonMethods;

public class LoginPage {

	
	WebDriver driver;
	
	 public LoginPage(){
		
		driver=CommonMethods.driver;
	}
	
	public void logontoflipkart() {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("rahul.lifewater@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("dattatray111");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	}
	
	public void logout() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//div[contains(text(),'Rahul')]"));
		Actions action = new Actions(driver);

		action.moveToElement(username).build().perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[contains(text(),'Logout']")).click();
		
	}
}
