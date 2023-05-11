package InterviewPOIExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;
//XSSFWorkbook  XSSFSheet  XSSFRow  XSSFCell
//getSheetAt getRow getCell getCellType  getStringCellValue
// Program to Read from Excel using GetLastrownum, getLastCellNum, getrow, getcell, getcelltype, getcellvalue
public class ReadfromExcelget {
	@Test
	public void Testcase1() throws IOException {
		String excelfile = "D:\\SeliniumWorkspace\\InterviewPOIExcel\\TestDataFiles\\Testdata.xlsx";
		FileInputStream inputfile = new FileInputStream(excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(inputfile);
		// To get sheet count
		int sheetcount = workbook.getNumberOfSheets();
		System.out.println("sheetcount="+sheetcount);

		for (int i = 0; i < sheetcount; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("City")) {

				XSSFSheet sheet = workbook.getSheetAt(0);// Get the sheet1 of index 0
				// Get the row count
				int row = sheet.getLastRowNum();
				// Get the column count
				// sheet.getRow(Rownumber)will retrieve all the cellsvalues in that one row
				int col = sheet.getRow(1).getLastCellNum();
				System.out.println("Rowcount="+row);
				System.out.println("Columncount="+col);
				// Using For Loop to iterate through all rows
				for (int r = 0; r < row; r++) {
					// sheet.getRow(Rownumber)will retrieve all the cellsvalues in that one row
					// XSSFRow will store the row objects after retriving all cell values in that
					// one row
					XSSFRow rowobj = sheet.getRow(r);
					for (int c = 0; c < col; c++) {
						// .getcell(columnindex) will get the cell values in that particular row
						// XSSFCell will store the Cellvalue as object
						XSSFCell cellobj = rowobj.getCell(c);											
						// System.out.println(cellobj.getCellType());
						// Get the cell type of the cell value object						
						switch (cellobj.getCellType()) {
						case STRING:
							System.out.print(cellobj.getStringCellValue());
							break;
						case NUMERIC:
							System.out.print(cellobj.getNumericCellValue());
							break;
						case BOOLEAN:
							System.out.print(cellobj.getBooleanCellValue());
							break;
						default:
							break;
						}
						System.out.print(" | ");
					}
					System.out.println();
				}
				workbook.close();
			}
		}
	}

}
