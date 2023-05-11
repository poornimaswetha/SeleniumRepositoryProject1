package InterviewPOIExcel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	@DataProvider(name = "NinjaLogin")
	public Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream(
				"D:\\SeliniumWorkspace\\InterviewPOIExcel\\TestDataFiles\\Testdata.xlsx");
		XSSFWorkbook WorkBook = new XSSFWorkbook(fis);
		XSSFSheet sht = WorkBook.getSheetAt(1);
		// Get rowcount and column count
		int rowcount = sht.getPhysicalNumberOfRows();
		int colcount = sht.getRow(0).getLastCellNum();
		System.out.println("Rowcount=" + rowcount);
		System.out.println("Columncount=" + colcount);
		
		//Object array 2 dimensional = Object array[2][3];
		Object[][] data = new Object[rowcount - 1][colcount];
		for (int r = 0; r < rowcount - 1; r++) {
			XSSFRow row = sht.getRow(r + 1);
			for (int c = 0; c < colcount; c++) {
				XSSFCell col = row.getCell(c);
				// Dataformatter will convert all cell value types to string
				DataFormatter df = new DataFormatter();
				data[r][c] = df.formatCellValue(col);
				System.out.println(data[r][c]);
			}
		}

		WorkBook.close();
		fis.close();
		return data;

	}

}