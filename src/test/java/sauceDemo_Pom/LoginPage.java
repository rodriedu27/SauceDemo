package sauceDemo_Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {	
	
	By usernameLocator = By.xpath("//*[@id='user-name']");
	By passwordLocator = By.xpath("//*[@id='password']");
	By loginButtonLocator = By.xpath("//*[@id='login-button']");
	By homeDisplayedLocator = By.xpath("//*[@id='shopping_cart_container']/a");	
	final String USER = "standard_user";
	final String PASS = "secret_sauce";
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setUser() throws InterruptedException {
		click(usernameLocator);		
		type(USER, usernameLocator);
	}
	
	public void setPass() {
		click(passwordLocator);		
		type(PASS, passwordLocator);
	}
	
	public void clickSubmit() {
		click(loginButtonLocator);
	}
	
	public void LogInUser() throws InterruptedException {
		if(isDisplayed(usernameLocator)){
			setUser();
			setPass();
			clickSubmit();
		}else {
			System.out.println("no se encuentra el elemento username");
		}
		
	}
	
	public Boolean isHomePageDisplayed() {
		return isDisplayed(homeDisplayedLocator);
	}

}
