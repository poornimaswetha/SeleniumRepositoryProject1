package ExcelPOI;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPoiTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Reading xlsx file
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream("D:\\ExcelTestData\\testdata.xlsx"));
		
		//Reading Sheet
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		//Reading data
		String pwd = sh.getRow(1).getCell(1).toString();
		
		System.out.println(pwd);
		
		//get row count
		int rowcnt=sh.getLastRowNum();
		System.out.println("Index of Last Row Number :"+rowcnt);
		
		//get column number of first row index
		int colcnt=sh.getRow(0).getLastCellNum();
		System.out.println("Index of Last Column Number :"+colcnt);
		
		//Get Each cell value of username and password in the excel sheet
		
		for(int i=0;i<=rowcnt;i++) {
			for(int j=0;j<colcnt;j++) {
				
				String cel=sh.getRow(i).getCell(j).toString();
				System.out.println("row: "+i+", Col :"+j+" value :"+ cel);
			
			}
		}
		
		wb.close();
		
	}

}
