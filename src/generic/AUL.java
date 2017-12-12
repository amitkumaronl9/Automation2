package generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AUL 
{

public static String getProperty(String settingsPath, String key) 
{
	String value="";
	try
	{
	Properties p=new Properties();
	p.load(new FileInputStream(settingsPath));
	value=p.getProperty(key);
	}
	catch(Exception e)
	{
		
	}
	return value;
}
public static void takeScreenPhoto(String Folder,String testName,WebDriver driver)
{
	Date d=new Date();
	String date=d.toString();
	String dateActual=date.replaceAll(":","-");
	TakesScreenshot snap=(TakesScreenshot)driver;
	File srcFile=snap.getScreenshotAs(OutputType.FILE);
	String destPath=Folder+testName+dateActual+".png";
	try
	{
		FileUtils.copyFile(srcFile,new File(destPath));
	}
	catch(Exception e)
	{
		
	}
}
}
