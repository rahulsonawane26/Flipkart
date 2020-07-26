package PageObject;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import TestCases.CommonMethods;

public class Homepage {

	WebDriver driver;

	public Homepage() {

		driver=CommonMethods.driver;
	}

	public void search(String search) throws InterruptedException {
		

		WebElement searchbox = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		WebElement searchbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		searchbox.sendKeys(search);
		searchbutton.click();
		Thread.sleep(5000);
	}

	public void gettoplinks() throws InterruptedException {
		
		WebElement topDiv = driver.findElement(By.xpath("//div[@class='_3zdbog _3Ed3Ub']"));
		List<WebElement> topDivLinks = topDiv.findElements(By.xpath("//li[contains(@class,'Wbt_B2 ')]"));
		
		for(int i=0; i<topDivLinks.size(); i++) {
			
			System.out.println(topDivLinks.get(i).getText());
			
		}
	
	}
	
	
}
