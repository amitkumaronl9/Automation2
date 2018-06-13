package Jar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion 
{
	static
	{
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.co.in/");
     driver.findElement(By.id("lst-ib")).sendKeys("Java");
     try 
     {
		Thread.sleep(3000);
	 } catch (InterruptedException e) 
     {
		
		e.printStackTrace();
	 }
     List<WebElement> list=driver.findElements(By.xpath("//div[contains(.,'java')]"));
     System.out.println(list.size());
     int count=list.size();
     for (int i = 0; i <count; i++) 
     {
    	WebElement element= list.get(i);
    	String s=element.getText();
    	System.out.println(s);
		
	 }
	}

}
