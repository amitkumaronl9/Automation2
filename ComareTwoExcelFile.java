package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ComareTwoExcelFile 
{
	public static void main(String[] args) 
	{
		try 
		{
			Workbook wb=WorkbookFactory.create(new File("./data/Book1.xlsx"));
			Workbook wb1=WorkbookFactory.create(new File("./data/Book2.xlsx"));
			
			int size1=wb.getSheet("Sheet1").getLastRowNum();
			int size2=wb1.getSheet("Sheet1").getLastRowNum();
			for (int i = 0; i<=size1; i++) 
			{
				for (int j = 0; j < size2; j++) 
				{
					String s=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
					String s1=wb1.getSheet("Sheet1").getRow(i).getCell(j).toString();
					if(s.equals(s1))
					{
						System.out.println(s+" is equals to "+s1);
					}
					else
					{
						System.out.println(s+" is not equals to "+s1);
					}
				}
				
			}
			
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) 
		{
			e.printStackTrace();
		}
	}

}
