package Jar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelectedorNot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amitk/Desktop/Checkboxes.html");
		String xp="//input[@type='checkbox']";
		List<WebElement> ch=driver.findElements(By.xpath(xp));
		int count=ch.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) 
		{
	
		}
	}

}
