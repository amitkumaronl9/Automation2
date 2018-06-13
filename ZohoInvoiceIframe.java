package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoInvoiceIframe 
{
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoho.com/in/invoice/login/");
		String eTitle="Invoicing Software | Zoho Invoice";
		verifyTitle(driver,eTitle);
		driver.switchTo().frame("zohoiam");
		driver.findElement(By.name("lid")).sendKeys("Amit");
		driver.findElement(By.name("pwd")).sendKeys("Kumar");
		driver.findElement(By.id("submit_but")).click();
	}
	private static void verifyTitle(WebDriver driver, String eTitle) 
	{
		String aTitle=driver.getTitle();
		if(eTitle.equals(aTitle))
		{
			System.out.println("Login Page is Displayed");
		}
		else
		{
			System.out.println("Login Page is not Displayed");
		}
		
	}

}
