package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginPage;

public class FlipkartTest extends CommonMethods {
	
	@Test
	public void login() throws InterruptedException {
		LoginPage login = new LoginPage();
		
		login.logontoflipkart();
		login.logout();
	}

}
