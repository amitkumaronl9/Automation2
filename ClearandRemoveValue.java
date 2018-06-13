package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearandRemoveValue 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		WebElement un=driver.findElement(By.id("username"));
		String value=un.getAttribute("value");
		System.out.println(value);
		
		WebElement un2=driver.findElement(By.id("username"));
		un2.clear();
		un2.sendKeys("Amit");
		un2.sendKeys(Keys.CONTROL+"a");
		un2.sendKeys(Keys.CONTROL+"c");
		un2.sendKeys(Keys.TAB);
		try
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		un2.sendKeys(Keys.CONTROL+"v");
		try
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		un2.sendKeys(Keys.CONTROL+"a");
		un2.sendKeys(Keys.DELETE);
		
	}
}
