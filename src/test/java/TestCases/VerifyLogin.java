package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.CommonUtilities;
import Resources.baseClass;
import Resources.constant;

public class VerifyLogin extends baseClass{
	
	   @Test
	   public void login() throws IOException {
		
		LoginPageObjects obj=new LoginPageObjects(driver);
		obj.enterUsername().sendKeys(constant.username);
		obj.enterPassword().sendKeys(constant.Password);
		obj.clickOnLogin().click();
		
   CommonUtilities.Handleassertion(constant.expectedString,obj.actualErrorMassage().getText());
		
	   }
	}	
	
