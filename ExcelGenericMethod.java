package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelGenericMethod 
{
  public static String getCellValue(String path,String sheet,int r,int c)
  {
	  String s="";
	  try 
	  {
		Workbook wb=WorkbookFactory.create(new File(path));
		s=wb.getSheet(sheet).getRow(r).getCell(c).toString();
	  } 
	  catch (EncryptedDocumentException | InvalidFormatException | IOException e) 
	  {
	
		e.printStackTrace();
	  }
	  return s;
  }
  public static int rowCount(String path,String sheet)
  {
	  int i=0;
	  try 
	  {
		Workbook wb=WorkbookFactory.create(new File(path));
		i=wb.getSheet(sheet).getLastRowNum();
	  } 
	  catch (EncryptedDocumentException | InvalidFormatException | IOException e) 
	  {
		e.printStackTrace();
	  }
	  return i;
  }
  public static void main(String[] args) 
  {
	String str=getCellValue("./data/Book1.xlsx","Sheet1",0, 0);
	int i=rowCount("./data/Book1.xlsx","Sheet1");
	System.out.println(str);
	System.out.println(i);
  }
}
