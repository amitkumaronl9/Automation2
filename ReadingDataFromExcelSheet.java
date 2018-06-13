package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcelSheet
{
	public static void main(String[] args)
	{
	    try 
	    {
	    Workbook wb1= WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		Sheet s=wb1.getSheet("sheet1");
	       Row r=s.getRow(0);
	       Cell c=r.getCell(0);
	       String v=c.getStringCellValue();
	       System.out.println(v);
	    } 
	   catch (EncryptedDocumentException | InvalidFormatException | IOException e)
	    {
		e.printStackTrace();
	    }
	  
	}
}
