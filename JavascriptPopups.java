package Jar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopups
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
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[contains(@class,'createNewCustomer')]")).click();
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Hello");
		driver.findElement(By.id("customerLightBox_cancelBtn")).click();
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Alert alert=driver.switchTo().alert();
		String message=alert.getText();
		System.out.println(message);
		alert.accept();
		
	}

}
