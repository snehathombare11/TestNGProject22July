package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	public WebDriver driver;
	
	public void initializeDriver() throws IOException {
    FileInputStream fis=new FileInputStream("C:\\Users\\Prakash\\eclipse-workspace\\Mainproject\\src\\main\\java\\Resources\\data.properties");
	
    Properties prop=new Properties();	
	prop.load(fis);
	String browserName=prop.getProperty("browser");
		
     if(browserName.equalsIgnoreCase("chrome")) {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\Desktop\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
     }
     else if(browserName.equalsIgnoreCase("firefox")){
     }
	
	else if(browserName.equalsIgnoreCase("edge")) {
	}
	else {
		System.out.println("Please enter proper browser value");
	
	
	
     


     }	
}
}