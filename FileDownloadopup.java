package Jar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadopup
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
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
		driver.findElement(By.xpath("//div[.='REPORTS']")).click();
		try 
		{
			Thread.sleep(6000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//td[@class='content-cell']")).click();
		try 
		{
			Thread.sleep(6000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//td[contains(.,'Export')]")).click();
		try
		{
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e)
		{
			e.printStackTrace();
		}
	}
	

}
