package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadUsingDataFormater {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Excel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		DataFormatter df =new DataFormatter();
		String text =df.formatCellValue(wb.getSheet("sheet1").getRow(1).getCell(1));
		System.out.println(text);
		wb.close();
		
		
		
		

	}

}
