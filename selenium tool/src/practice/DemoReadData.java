package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoReadData {
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
	 /*  Sheet s = wb.getSheet("sheet1");
	      Row r = s.getRow(1);
	       Cell c = r.getCell(0);
	       String data = c.getStringCellValue();
	       System.out.println(data);
	*/String pandit = wb.getSheet("sheet1").getRow(1).getCell(1).toString();
	System.out.println(pandit);
	
	}

}
