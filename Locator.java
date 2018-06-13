package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator 
{
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amitk/Desktop/tagName.html");
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.get("file:///C:/Users/amitk/Desktop/tagName.html");
		driver.findElement(By.id("id")).click();
		driver.navigate().back();
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.get("file:///C:/Users/amitk/Desktop/tagName.html");
		driver.findElement(By.name("Amit")).click();
		driver.navigate().back();
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.get("file:///C:/Users/amitk/Desktop/tagName.html");
		driver.findElement(By.className("Webpage")).click();
		driver.navigate().back();
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.get("file:///C:/Users/amitk/Desktop/tagName.html");
		driver.findElement(By.linkText("ActiTime")).click();
		driver.navigate().back();
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.get("file:///C:/Users/amitk/Desktop/tagName.html");
		driver.findElement(By.partialLinkText("Time")).click();
		driver.navigate().back();
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
