package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import Resources.baseClass;

public class VerifyLogin extends baseClass{
	
	   @Test
	   public void login() throws IOException {
		initializeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
	
	
	
	}	
	
}