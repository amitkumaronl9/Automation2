package Jar;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void takePhoto(WebDriver driver, String path)
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(srcFile, new File(path));
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Date d=new Date();
		String date=d.toString();
		System.out.println(date);
		String replaceColon=date.replaceAll(":","_");
		System.out.println(replaceColon);
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./photo"+replaceColon+".png");
		/*png->Portable Network Graphics*/
		try
		{
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		
		
	}
}
