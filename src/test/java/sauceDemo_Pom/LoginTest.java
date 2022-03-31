package sauceDemo_Pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	
	private WebDriver driver;
	LoginPage loginPage;
	final String URL = "https://www.saucedemo.com";
	
	@Before
	public void setUp() {
		loginPage = new LoginPage(driver);
		driver = loginPage.chromeDriverConnection();
		loginPage.visit(URL);
	}
	
	@After
	public void tearDown() {
		driver.quit();
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		loginPage.LogInUser();
		Thread.sleep(2000);
		assertTrue(loginPage.isHomePageDisplayed());
	}

}
