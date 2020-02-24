package Framework.Hybrid.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceLParser {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	// String Paths = "D:\\Seleniumworkspace\\Excel Files\\Excelfile.ods";
	// this.
	// private static String
	// Path="C:\\Personal\\AutomationHomeContainsDoc\\MyNotes\\testdata.xlsx";
	private static String Path;

	/*
	 * public ExceLParser() throws IOException { String Paths =
	 * "D:\\Seleniumworkspace\\Excel Files\\TestData.xlsx"; this.Path = Paths;
	 * 
	 * // Open the Excel file
	 * 
	 * FileInputStream ExcelFile = new FileInputStream(Paths);
	 * 
	 * // Access the required test data sheet
	 * 
	 * XSSFWorkbook ExcelWBooks = new XSSFWorkbook(Paths);
	 * 
	 * XSSFSheet ExcelWSheets = ExcelWBook.getSheetAt(0);
	 * 
	 * this.ExcelWBook = ExcelWBooks; this.ExcelWSheet = ExcelWSheets;
	 * 
	 * }
	 */

	// This method is to set the File path and to open the Excel file, Pass
	// Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path, String SheetName)
			throws Exception {

		try {

			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e) {

			throw (e);

		}

	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			return "";

		}

	}

	public int getLastRowNum() {
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		int rowcount = ExcelWSheet.getLastRowNum();
		return rowcount;

	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters
	// setCellData(String Result, int RowNum, int ColNum,String Path)
	public static void setCellData(String Result, int RowNum, int ColNum)
			throws Exception {

		try {

			// Cell = Row.createCell(ColNum);
			// Cell.setCellValue(Result);

			// Row = ExcelWSheet.createRow(RowNum);
			Row = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

			// Constant variables Test Data path and Test Data file name

			// FileOutputStream fileOut = new
			// FileOutputStream(Constant.Path_TestData +
			// Constant.File_TestData);
			FileOutputStream fileOut = new FileOutputStream(
					Constant.Path_TestData + Constant.File_TestData);

			ExcelWBook.write(fileOut);

			// fileOut.flush();

			fileOut.close();

		} catch (Exception e) {

			throw (e);

		}
	}

}