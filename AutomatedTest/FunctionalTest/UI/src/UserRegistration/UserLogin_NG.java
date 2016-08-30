package UserRegistration;

import org.testng.annotations.*;
import jxl.Sheet;
import jxl.Workbook;
import java.io.File;
import org.openqa.selenium.*;


public class UserLogin_NG extends Config{
	
	private boolean acceptNextAlert = true;
 
  @Test
  public void testUserLoginNG() throws Exception {
    driver.get(baseUrl + "/dhsweb/#/");
    
     //Access excel spreadsheet
	 Workbook wb = Workbook.getWorkbook(new File("C:\\workspace\\DHS\\data\\login.xls"));
	 //Get sheet1
	 Sheet sheet = wb.getSheet(0);
	 
	 
	 for (int i=1; i<sheet.getRows(); i++){
		
		//Enter login name 
		driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys(sheet.getCell(2,i).getContents());
	    //Enter Password
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("Password");
	    //Click Submit
	    driver.findElement(By.xpath("html/body/div[2]/div/div/form/div[3]/div/button")).click();
		    
		 
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
