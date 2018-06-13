package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IstqbMousePointer 
{
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.istqb.in/");
	WebElement element=driver.findElement(By.xpath("//span[.='FOUNDATION']"));
	Actions action=new Actions(driver);
	action.moveToElement(element).perform();
	try
	{
		Thread.sleep(2000);
	} catch (InterruptedException e) 
	{
		e.printStackTrace();
	}
	WebElement element2=driver.findElement(By.xpath("//span[.='ENROLLMENT']"));
	action.moveToElement(element2).perform();
	try
	{
		Thread.sleep(2000);
	} catch (InterruptedException e) 
	{
		e.printStackTrace();
	}
	WebElement element3=driver.findElement(By.xpath("//span[.='CORPORATE ENROLLMENT']"));
	action.moveToElement(element3).perform();
	try
	{
		Thread.sleep(2000);
	} catch (InterruptedException e) 
	{
		e.printStackTrace();
	}
	WebElement element4=driver.findElement(By.xpath("//span[.='ONLINE ENROLLMENT']"));
	element4.click();
	
	
}
}
