package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
public WebDriver driver;	
	//driver.findElement(By.xpath)//
	
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");
	By tryForfree=By.xpath("//a[@id='signup_link']");
	By actualerrormassage=By.xpath("//div[@id='error']");
	
			public LoginPageObjects(WebDriver driver2) {
	     this.driver=driver2;
	}

	public WebElement enterUsername() {
		return driver.findElement(username);
		
	}
	
		public WebElement enterPassword() {
			return driver.findElement(password);
		}
		
		public WebElement clickOnLogin() {
			return driver.findElement(login);
			}	
		
		public WebElement clickOnTryForFree() {
			return driver.findElement(tryForfree);
				}	
		public WebElement actualErrorMassage() {
			return driver.findElement(actualerrormassage);
					
}
}