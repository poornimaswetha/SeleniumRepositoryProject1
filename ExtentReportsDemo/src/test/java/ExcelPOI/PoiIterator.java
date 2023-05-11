package ExcelPOI;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class PoiIterator {

		public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//Reading xlsx file
				XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream("D:\\ExcelTestData\\testdata.xlsx"));
				
				//Reading Sheet
				XSSFSheet sheet=wb.getSheet("Sheet1");
			
			    Iterator<Row> rowIterator = sheet.iterator();
			    while (rowIterator.hasNext()) {
			      Row row = rowIterator.next();
			      
			      Iterator <Cell> cellIterator = row.cellIterator();
			      while (cellIterator.hasNext()) {
			        Cell cell = cellIterator.next();
			        System.out.print(cell.getStringCellValue() + "\t\t");
			      }
			    }
			    
			    wb.close();
			  }
					
					
}

