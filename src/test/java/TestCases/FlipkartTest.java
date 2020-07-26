package TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BuyPage;
import PageObject.Homepage;
import PageObject.LoginPage;
import PageObject.SearchResult;

public class FlipkartTest extends CommonMethods {
	

/*	@Test
	public void search() throws InterruptedException {
		
		login.logontoflipkart();
		Thread.sleep(3000);
		Homepage homepage = new Homepage();
		homepage.search("Apple Mobiles");
		SearchResult search = new SearchResult();
		search.price("50000");
		BuyPage buypage = new BuyPage();
		String price1= buypage.checkproductprice();
		String price2 = buypage.checkcartprice();
		assertTrue(price1.equals(price2));
		
	}
	*/
	@Test
	public void listoflinksonhomepagetopdiv() throws InterruptedException {
		
		Homepage homepage = new Homepage();
		homepage.gettoplinks();
		
	}

	/*@Test
	public void errorEmail() throws InterruptedException {
		
		LoginPage login = new LoginPage();
		String respoce = login.loginvalidationEmail("rahul.lifewater");
		Thread.sleep(3000);
		String expectedError = "Please enter valid Email ID/Mobile number";
		assertTrue(respoce.equals(expectedError));
		
	}
	
	@Test
	public void errorMobile() throws InterruptedException {
		Thread.sleep(3000);
		LoginPage login = new LoginPage();
		String respoce = login.loginvalidationMobile("1231235");
		Thread.sleep(3000);
		String expectedError = "Please enter valid Email ID/Mobile number";
		assertTrue((respoce.equals(expectedError)));	
	}
	
	@Test
	public void loginvalidationPassword() throws InterruptedException {
		LoginPage login = new LoginPage();
		String respoce =login.loginvalidationPassword("12312");
		Thread.sleep(3000);
		String expectedError = "Your username or password is incorrectr";
		assertTrue(respoce.equals(expectedError));
		
	}
	*/
}
