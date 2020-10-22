package PageObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.ui.Select;

import TestCases.CommonMethods;

public class SearchResult {

	WebDriver driver;

	public SearchResult() {

		driver = CommonMethods.driver;
	}

	public void price(String conditon) throws InterruptedException {

		Thread.sleep(5000);
		Select pricedd = new Select(driver.findElement(By.xpath("(//*[@class='fPjUPw'])[2]")));
		pricedd.selectByIndex(9);
		Thread.sleep(5000);
		WebElement firstproductname = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]"));
		firstproductname.click();

	}

	public void searchresultn() throws InterruptedException {

		Thread.sleep(5000);
		List<WebElement> one = driver.findElements(By.xpath("(//div[@class='_3O0U0u'])[1]"));
		List<WebElement> two = driver.findElements(By.xpath("(//div[@class='_3O0U0u'])[2]"));
		one.addAll(two);
		System.out.println(one);

	}

	public List phonename() {

		List<WebElement> name = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		return name;
	}

	public List phoneprice() {

		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		return price;

	}
}
