package InterviewPOIExcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

//XSSFWorkbook  XSSFSheet  XSSFRow  XSSFCell
//createSheet createRow createCell // instance of // set cell value

//Write in Excel using ExcelPOI 
//Using ArrayList Objects Wrapper class and For each
public class WriteToExcelForEach {
	@Test
	public void TestCase2() throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet worksheet = workbook.createSheet("EmployeeDetails");
		
		// Create ArrayList with Object wrapper class - Object single dimensional array	
		ArrayList<Object[]> empdata=new ArrayList<>();
		empdata.add(new Object[]{"EmpNo", "EmpName", "JobTitle"} );
		empdata.add(new Object[]{ "101", "Peter", "Tester" });
		empdata.add(new Object[]{ "102", "David", "Manager" } );
		empdata.add(new Object[]{ "103", "Hema", "TeamLeader" } );	
		
		int r=0;
		for(Object[] emp:empdata) { // Object array - EmpNo as object, EmpName as object,JobTitle as object
			XSSFRow row=worksheet.createRow(r++);
			int c=0;
			for(Object cellvalue:emp) { // Object array contains each object inside it
			XSSFCell cell=row.createCell(c++);
		
				//Checking if the cellvalue is string or Integer or Boolean
				// Then write the cellvalue inside the cell
				// instance of // set cell value
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
			
		String filepath="D:\\SeliniumWorkspace\\InterviewPOIExcel\\TestDataFiles\\WriteDataForEach.xlsx";
		FileOutputStream fileoutput=new FileOutputStream(filepath);
		workbook.write(fileoutput);
		
		fileoutput.close();
		System.out.println("Excel File Successfully written");
		workbook.close();
	}
}
