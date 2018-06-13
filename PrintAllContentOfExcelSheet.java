package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllContentOfExcelSheet 
{
 public static void main(String[] args) 
 {
	 try 
	    {
	    Workbook wb1= WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		int s=wb1.getSheet("sheet1").getLastRowNum();
		for (int i = 0; i <= s; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				   String v=wb1.getSheet("Sheet1").getRow(i).getCell(j).toString();
			       System.out.print(v+" ");
			}
			System.out.println();
		}
	
	    } 
	   catch (EncryptedDocumentException | InvalidFormatException | IOException e)
	    {
		e.printStackTrace();
	    }
 }
}
