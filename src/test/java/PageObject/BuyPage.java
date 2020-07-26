package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestCases.CommonMethods;

public class BuyPage {

	WebDriver driver;
	
	public BuyPage() {
		
		driver= CommonMethods.driver;
	}
	
	public String checkproductprice() throws InterruptedException {
		
		Thread.sleep(6000);
		WebElement buypagePrice = driver.findElement(By.className("_1uv9Cb"));
		String buypagePricetext= buypagePrice.getText();
		System.out.println(buypagePricetext);
		Thread.sleep(5000);
		driver.navigate().to("https://www.flipkart.com/viewcart?otracker=PP_GoToCart");
		//driver.findElement(By.xpath("//*[contains(text(),'ADD TO CART')]")).click();
		return buypagePricetext;
		
		
	}
	public String checkcartprice() throws InterruptedException {
		
		Thread.sleep(6000);
		WebElement buypagePrice = driver.findElement(By.className("tnAu1u"));
		String buypagePricetext= buypagePrice.getText();
		System.out.println(buypagePricetext);
		return buypagePricetext;
		
	
}
}