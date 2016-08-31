package ChallengeExcercise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Config {
	
	public static WebDriver driver;
	public String baseUrl;

	public UserRegistration userregistration;
	public UserLogin loginpage;

	@BeforeSuite
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
		driver = new ChromeDriver();
	    baseUrl = "https://dhstest.spinsys.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	 		
	}

	@AfterSuite
	public void tearDown(){

	    if (driver != null) {
	        driver.quit();
	        
	    }
//	    removerUsers rmvusr = new removerUsers();
//	    rmvusr.deleteUser("Test");
	}

}
