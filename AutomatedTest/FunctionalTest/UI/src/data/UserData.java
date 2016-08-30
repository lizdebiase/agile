package data;

import java.io.File;
import jxl.Sheet;
import jxl.Workbook;

public class UserData {
	
	public void accessData() throws Exception{
		
		Workbook wb = Workbook.getWorkbook(new File("C:\\workspace\\DHS\\data\\login.xls"));
		
		Sheet sheet = wb.getSheet(0);
		
	}
	
	
	
}
