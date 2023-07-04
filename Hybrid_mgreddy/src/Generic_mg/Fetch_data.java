package Generic_mg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data {
	 
	public static String Get_data(String sh,int r,int c) {
		String value = null;
		try {
			FileInputStream fis = new FileInputStream("./Excel_sheet/Book1.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			 Sheet sh1 = book.getSheet(sh);
			 Row row = sh1.getRow(r);
			 Cell cell = row.getCell(c);
			 value = cell.toString();
		} 
		catch(Exception e) {
			System.out.println(e);
		}
		return value;
		
	}
		

}
