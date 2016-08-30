package UserRegistration;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class StarRating_NG extends Config {
	
	private boolean acceptNextAlert = true;
 

  @Test
  public void testStarRatingNG() throws Exception {
    driver.get(baseUrl + "/dhsweb/#/star-rating");
    driver.findElement(By.xpath("html/body/div[2]/div/div/content/form/div[4]/div/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 10) fail("timeout");
    	try { if ("".equals(closeAlertAndGetItsText())) break; } catch (Exception e) {}
    	Thread.sleep(1000);
        	
    }
    
    System.out.println("Error Message! Category is a required field.");
	Robot rb =new Robot();

	rb.keyPress(KeyEvent.VK_ENTER);
  	rb.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
  

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

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
