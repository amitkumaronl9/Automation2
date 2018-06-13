package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColourCode 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void verifyTitle(WebDriver driver,String expectedTitle)
	{
		System.out.println(expectedTitle);
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	    if(expectedTitle.equals(actualTitle))
	  	{
	  		System.out.println("PAss");
	  	}
	  	else
	  	{
	  		System.out.println("Fail");
	  	}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		String expectedTitle="actiTIME - Login";
		verifyTitle(driver,expectedTitle);
		
		String xp1="//div[.='Login ']";
	 	driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("managerr");
		driver.findElement(By.xpath(xp1)).click();
		Thread.sleep(2000);
		String xp="//span[contains(.,'invalid')]";
		WebElement errmsg=driver.findElement(By.xpath(xp));
		String rgb=errmsg.getCssValue("color");
		System.out.println(rgb);
		String hexa=Color.fromString(rgb).asHex();
		System.out.println(hexa);
		
	}

}
