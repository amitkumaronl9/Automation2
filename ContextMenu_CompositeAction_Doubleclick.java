package Jar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu_CompositeAction_Doubleclick 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.istqb.in/");
		Actions action=new Actions(driver);
		
		WebElement element=driver.findElement(By.xpath("//img[@src='/images/visa-logo12.PNG']"));
		action.contextClick(element).perform();
		try
		{
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_W);
		} catch (AWTException e)
		{
	
			e.printStackTrace();
		}
		WebElement element2=driver.findElement(By.xpath("//a[.='Duplicate Certificate Fees = 354']"));
		action.sendKeys(Keys.CONTROL).click(element2).build().perform();
	}

}
