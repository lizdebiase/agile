package ChallengeExcercise;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UserLogin extends Config{
/*  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    //driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
	driver = new ChromeDriver();
    baseUrl = "https://dhstest.spinsys.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }*/

  @Test
  public void testUserLogin() throws Exception {
    driver.get(baseUrl + "/dhsweb/#/");
    assertEquals(driver.getTitle(), "DHS Website");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("temul@icloud.com");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("Wordpa$$890");
    driver.findElement(By.xpath("//body[@id='body']/div[2]/div/div/form/div[3]/div/button")).click();
  }



  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


}

