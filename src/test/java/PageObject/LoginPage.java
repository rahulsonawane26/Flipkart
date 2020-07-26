package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestCases.CommonMethods;

public class LoginPage extends CommonMethods{


	private String email;
	private String mobile;
	private String password;
	WebDriver driver;
	
	public LoginPage(){
		
		driver = CommonMethods.driver;
		
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
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[10]/a/div")).click();
		Thread.sleep(7000);
	}
	
	public String loginvalidationEmail(String email) {
		this.email= email;
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(this.email);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("dattatray111");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		String error = driver.findElement(By.xpath("//span[@class='ZAtlA-']")).getText();
		return error;
	}	
	
	public String loginvalidationMobile(String Mobile) {
		this.mobile= Mobile;
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(mobile);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("dattatray111");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		String error = driver.findElement(By.xpath("//span[@class='ZAtlA-']")).getText();
		return error;
	}
	
	
	public String loginvalidationPassword(String Pasword) {
		this.password= Pasword;
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("rahul.lifewater@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
		String error = driver.findElement(By.xpath("//span[@class='ZAtlA-']")).getText();
		return error;
		
	}
	
}
