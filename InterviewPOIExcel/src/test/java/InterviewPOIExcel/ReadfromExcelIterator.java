package InterviewPOIExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

// Program to Read from Excel using Iterator Method
public class ReadfromExcelIterator {
	@Test
	public void Testcase1() throws IOException {
		String excelfile = "D:\\SeliniumWorkspace\\InterviewPOIExcel\\TestDataFiles\\Testdata.xlsx";
		FileInputStream inputfile = new FileInputStream(excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(inputfile);
		XSSFSheet sheet = workbook.getSheetAt(0);// Get the sheet1 of index 0

		// The row iterator method will retrieve all the rows and store as row object
		Iterator<Row> rowall = sheet.rowIterator();
		while (rowall.hasNext()) {
			// First row ( or Current row )will be retrieved and stored as object in rowobj variable
			XSSFRow row = (XSSFRow) rowall.next();

			// The cell iterator method will retrieve all the cells in one row and store as
			// cell object
			Iterator<Cell> cellall = row.cellIterator();
			while (cellall.hasNext()) {
				// Currrent row's Current cell value will be stored in cellobj variable
				XSSFCell cell = (XSSFCell) cellall.next();
				// System.out.println(cellobj.getCellType());
				// Get the cell type of the cell value object
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
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
