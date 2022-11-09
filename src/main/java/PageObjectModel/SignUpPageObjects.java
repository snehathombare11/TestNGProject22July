package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
public WebDriver driver;
	
	By firstname=By.xpath("//input[@name='UserFirstName']");
	By lastname=By.xpath("//input[@name='UserLastName']");
	By workemail=By.xpath("//input[@name='UserEmail']");
	By jobtitle=By.xpath("//select[@name='UserTitle']");
	By company=By.xpath("//input[@name='CompanyName']");
	By employees=By.xpath("//select[@name='CompanyEmployees']");
	By phone=By.xpath("//input[@name='UserPhone']");
	By country=By.xpath("//select[@name='CompanyCountry']");
	By agree=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	public SignUpPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}
		
	public WebElement enterlastname() {
			return driver.findElement(lastname);
	}
	public WebElement enterworkemail() {
		return driver.findElement(workemail);
	}
		public WebElement selectjobtitle() {
			return driver.findElement(jobtitle);
		}	
		
		public WebElement entercompany() {
			return driver.findElement(company);
		}	
	
		public WebElement selectEmployees() {
			return driver.findElement(employees);
		}	
		public WebElement enterphone() {
			return driver.findElement(phone);
		}			
		public WebElement selectcountry() {
			return driver.findElement(country);
		}	
		public WebElement clickagree() {
				return driver.findElement(agree);	
			
		}
     }


