package InterviewPOIExcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
//Write in Excel using ExcelPOI 
//XSSFWorkbook  XSSFSheet  XSSFRow  XSSFCell
//createSheet createRow createCell // instance of // set cell value
//Using Object 2 dimensional Array and for loop
public class WriteToExcelForLoop {
	@Test
	public void TestCase2() throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet worksheet = workbook.createSheet("EmployeeDetails");

		// Create the data and store in Object 2 dimensional Array ( Row, Col )
		// 2 dimension array ( Row x , col y)
		Object empdata[][] = { 
				{ "EmpNo", "EmpName", "JobTitle" }, 
				{ "101", "Peter", "Tester" },
				{ "102", "David", "Manager" }, 
				{ "103", "Hema", "TeamLeader" }
				};

		// No of Rows of input data
		int rowcount = empdata.length; // Gives no of rows
		// any one row take and find the col count
		// Here index 0 first row taken
		int colcount = empdata[0].length;
		System.out.println(rowcount);
		System.out.println(colcount);

		for (int r = 0; r < rowcount; r++) {
			// create a row
			XSSFRow row = worksheet.createRow(r);
			for (int c = 0; c < colcount; c++) {
				XSSFCell cell = row.createCell(c);
				// Write the object cellvalue in this cell
				 Object cellvalue = empdata[r][c];
				//Checking if the cellvalue is string or Integer or Boolean
				// Then write the cellvalue inside the cell
				//instance of // setcellvalue
				if  (cellvalue instanceof String) {
					cell.setCellValue((String) cellvalue);
				}
				if  (cellvalue instanceof Integer) {
					cell.setCellValue((Integer) cellvalue);
				}
				if  (cellvalue instanceof Boolean) {
					cell.setCellValue((Boolean) cellvalue);
				}
			}
		}
			
		String filepath="D:\\SeliniumWorkspace\\InterviewPOIExcel\\TestDataFiles\\WriteDataForLoop.xlsx";
		FileOutputStream fileoutput=new FileOutputStream(filepath);
		workbook.write(fileoutput);
		workbook.close();
		fileoutput.close();
		System.out.println("Excel File Successfully written");
	}
}
