package Jar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.naukri.com/");
		File f= new File("E:\\Amit Kumar new CV.docx");
		String path=f.getAbsolutePath();
		
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{

			e.printStackTrace();
		}*/
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		try 
		{
			Thread.sleep(6000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[contains(@class,'warning_icon')]")).click();
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
	
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		WebElement element2=driver.findElement(By.id("uploadNewLogoOption"));
		element2.click();
		if(element2.isSelected()) 
		{
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("Element is not selected");
		}
		File f2=new File("E:\\\\Amit Kumar new CV.docx");
		String path2=f2.getAbsolutePath();
		try 
		{
			Thread.sleep(10000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.name("formCustomInterfaceLogo.logo")).sendKeys(path2);
	}
}
