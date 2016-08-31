package ChallengeExcercise;

import org.testng.annotations.*;
import jxl.Sheet;
import jxl.Workbook;
import static org.testng.Assert.*;
import java.io.File;
import org.openqa.selenium.*;



public class UserRegistration extends Config{
	
	private boolean acceptNextAlert = true;
 
  @Test
  public void testUserLoginNG() throws Exception {
    driver.get(baseUrl + "/dhsweb/#/");
    
     //Access excel spreadsheet
	 Workbook wb = Workbook.getWorkbook(new File("C:\\workspace\\DHS\\data\\login.xls"));
	 //Get sheet1
	 Sheet sheet = wb.getSheet(0);
	 
	 
	 for (int i=1; i<sheet.getRows(); i++){
			
	     driver.get("http://dhstest.spinsys.com/dhsweb/");
		 assertEquals(driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div[2]/p")).getText(), "Employee Recognition System");
		 driver.findElement(By.linkText("Register Here")).click();
		 assertEquals(driver.findElement(By.cssSelector("h3")).getText(), "Register");
		 assertTrue(driver.findElement(By.cssSelector("span.required")).getText().matches("^[\\s\\S]* Required$"));
		 assertTrue(driver.findElement(By.xpath("//div[4]/div/label/span")).getText().matches("^[\\s\\S]* Required$"));
		 assertEquals(driver.findElement(By.cssSelector("em.password-hint")).getText(), "Must Contain 8-15 Characters, One Uppercase Letter & One Symbol");
		// assertEquals(driver.findElement(By.cssSelector("div.footer > div.container")).getText(), "Offical website of the Department of Homeland Security");
	    
	    // Enter First Name
	    driver.findElement(By.id("firstName")).clear();
	    driver.findElement(By.id("firstName")).sendKeys(sheet.getCell(0,i).getContents());
	     
	    //Enter Last Name
	    driver.findElement(By.id("lastName")).clear();
	    driver.findElement(By.id("lastName")).sendKeys(sheet.getCell(1,i).getContents());
	     
	    //Enter Email Address
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(sheet.getCell(2,i).getContents());
	     
	    //Enter incorrect password
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("test");			          
	    assertEquals(driver.findElement(By.cssSelector("span.warning.password > span.required")).getText(), "Invalid Password");
	    System.out.println("User unable to register - Password requirement not match");
	    
	    //Enter correct password
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(sheet.getCell(3,i).getContents());
	    
	    //Select User Role
	    driver.findElement(By.id(sheet.getCell(4,i).getContents())).click();
	    
	    //Click Submit
	    assertTrue(isElementPresent(By.cssSelector("button.btn-primary.btn")));
	    driver.findElement(By.cssSelector("button.btn-primary.btn")).click();
	    assertEquals(driver.findElement(By.cssSelector("h3.succuessful-h3")).getText(), "Successfully Registered");
	    System.out.println("User was able to register successfully!");
 }
	 

    
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
