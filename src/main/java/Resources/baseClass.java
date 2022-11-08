package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public WebDriver driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException {
    FileInputStream fis=new FileInputStream("C:\\Users\\Prakash\\eclipse-workspace\\Mainproject\\src\\main\\java\\Resources\\data.properties");
	
     prop=new Properties();	
	prop.load(fis);
	String browserName=prop.getProperty("browser");
		
     if(browserName.equalsIgnoreCase("chrome")) {
    	 //WebDriverManager.chromedriver().borwserVersion(79.0.9).setup();//
    	 WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
     }
     
     else if(browserName.equalsIgnoreCase("firefox")) {
     }
	
	else if(browserName.equalsIgnoreCase("edge")) {
	}
	else {
     System.out.println("Please enter proper browser value");
	}
     
}
     @BeforeMethod
     public void LaunchURL() throws IOException {
    	 initializeDriver();
    	 String url=prop.getProperty("url");
 		driver.get(url);
 		
     
	}
	}		
