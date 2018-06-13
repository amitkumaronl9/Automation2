package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataInExcelSheet 
{
	public static void main(String[] args)
	{
	    try 
	    {
	    Workbook wb1= WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		wb1.getSheet("sheet1").getRow(0).getCell(0).setCellValue("BTM");
	    wb1.write(new FileOutputStream("./data/Book1.xlsx"));
	    } 
	   catch (EncryptedDocumentException | InvalidFormatException | IOException e)
	    {
		e.printStackTrace();
	    }
	  
	}
}
