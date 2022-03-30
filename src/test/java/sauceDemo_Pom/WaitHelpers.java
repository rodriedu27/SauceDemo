package sauceDemo_Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelpers {
	
	 private WebDriver driver;
     
     private WebDriverWait wait;

     public WaitHelpers(WebDriver driver, int waitTimeInMilliseconds)  //quise crear una espera implicita pero por tiempo no me daba, usare una explicita
     {
         this.driver = driver;

         //wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInMilliseconds);     
     }

     public void WaitForElement(WebElement element)
     {
        // wait.until();
     }

}
