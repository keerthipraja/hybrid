package Framework.Hybrid.TestScripts;

import org.testng.annotations.Test;

import Framework.Hybrid.common.Constant;
import Framework.Hybrid.common.ExceLParser;


public class ExcelEx {
  @Test
  public void f() throws Exception {
	  
	  
	  

      //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

	    ExceLParser.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");

	    String sUserName = ExceLParser.getCellData(1, 1);
	  
		String sPassword = ExceLParser.getCellData(1, 2);
		
		System.out.println(sUserName);
		
		System.out.println(sPassword);
		
		ExceLParser.setCellData("pass", 1, 4);
	  
	 
  }
}
