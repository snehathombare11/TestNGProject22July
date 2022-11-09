package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
public static void HandleStaticDropdown(WebElement a,int index) {
	
	//This method is use for handling static dropdown//
	WebElement e=a;
	Select s=new Select(e);	
	s.selectByIndex(index);
}
//This method is use for handle aseertion static dropdown //
	public static void Handleassertion(String expected,String actual) {
	SoftAssert d=new SoftAssert();
	String expectedString=expected;
	String actualString=actual;
	d.assertAll();
}
}