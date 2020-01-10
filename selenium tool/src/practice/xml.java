package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xml{
	public static void main(String[] args) throws IOException, InterruptedException {
		new WorkbookFactory();
		Workbook wb =WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		String data = wb.getSheet("sheet2").getRow(3).getCell(0).toString();
		String data1 = wb.getSheet("sheet3").getRow(1).getCell(0).toString();
		 String data2 = wb.getSheet("sheet1").getRow(1).getCell(0).toString();
	
	System.out.println(data);
	System.err.println("****sheet3************data*");
	Thread.sleep(2000);
	System.out.println(data1);
	System.err.println("****sheet1 Data*************");
    System.out.println(data2);

}
}
