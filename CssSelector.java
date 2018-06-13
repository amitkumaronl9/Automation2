package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector 
{
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/amitk/Desktop/tagName.html");
	driver.findElement(By.cssSelector("a[id='id']")).click();
	driver.navigate().back();
	try 
	{
		Thread.sleep(3000);
	} catch (InterruptedException e) 
	{
	
		e.printStackTrace();
	}
	
	driver.findElement(By.cssSelector("a[id='id']")).click();
	driver.navigate().back();
	try 
	{
		Thread.sleep(3000);
	} catch (InterruptedException e) 
	{
	
		e.printStackTrace();
	}
	
	driver.findElement(By.cssSelector("a[name='Amit']")).click();
	driver.navigate().back();
	try 
	{
		Thread.sleep(3000);
	} catch (InterruptedException e) 
	{
	
		e.printStackTrace();
	}
	
	driver.findElement(By.cssSelector("a[class='Webpage']")).click();
	driver.navigate().back();
	try 
	{
		Thread.sleep(3000);
	} catch (InterruptedException e) 
	{
	
		e.printStackTrace();
	}
	
	
	driver.findElement(By.cssSelector("a.Webpage")).click();
	driver.navigate().back();
	try 
	{
		Thread.sleep(3000);
	} catch (InterruptedException e) 
	{
	
		e.printStackTrace();
	}
	
	driver.findElement(By.cssSelector("a#id")).click();
	driver.navigate().back();
	try 
	{
		Thread.sleep(3000);
	} catch (InterruptedException e) 
	{
	
		e.printStackTrace();
	}
	
	String str="a[href='http://localhost:8080/login.do']";
	driver.findElement(By.cssSelector(str)).click();
}
}
