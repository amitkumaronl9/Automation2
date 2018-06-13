package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
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
		driver.findElement(By.xpath("//div[.='TASKS']")).click();
		try 
		{
			Thread.sleep(6000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	   driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[1]")).click();
	   driver.findElement(By.xpath("//span[.='Delete']")).click();
	   try
	   {
		Thread.sleep(3000);
	   } catch (InterruptedException e) 
	   {
		
		e.printStackTrace();
	   }
	   WebElement element= driver.findElement(By.xpath("//div[@class='operationConfirmDialogInnerContainer']"));
	   String s=element.getText();
	   System.out.println(s);
	   try
	   {
		Thread.sleep(3000);
	   } catch (InterruptedException e) 
	   {
		
		e.printStackTrace();
	   }
	   driver.findElement(By.id("deleteTaskPopup_deleteConfirm_cancelBtn")).click();
		
	}

}
