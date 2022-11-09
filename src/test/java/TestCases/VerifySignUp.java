package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.CommonUtilities;
import Resources.baseClass;

public class VerifySignUp extends baseClass {
	
	@Test
	public void signup() throws IOException, InterruptedException {
	
		
		LoginPageObjects LPO=new LoginPageObjects(driver);
		LPO.clickOnTryForFree().click();
		
		SignUpPageObjects SPO=new SignUpPageObjects(driver);
		//to store  data//
		//In constant class declared static method// 
		Thread.sleep(5000);
		SPO.enterfirstname().sendKeys("sneha");
		SPO.enterlastname().sendKeys("jagdale");
		SPO.enterworkemail().sendKeys("snehathomabare11@gmail.com");	
		SPO.entercompany().sendKeys("TTL");
		SPO.enterphone().sendKeys("9920483156");
		SPO.clickagree().click();
		
		//call the method//
	CommonUtilities.HandleStaticDropdown(SPO.selectEmployees(),1);
		
	CommonUtilities.HandleStaticDropdown(SPO.selectjobtitle(),3);
	
	CommonUtilities.HandleStaticDropdown(SPO.selectcountry(),6);	
	   
	
     	
	}
}
	
	
	
