package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritTOExcellUsedRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Excel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet("sheet1");
		Row r=sh.getRow(4);
		Cell c=r.createCell(1);
		c.setCellValue("trainee");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Excel.xlsx");
		wb.write(fos);
		
		wb.close();
		
		

	}

}
