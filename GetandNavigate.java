package Jar;

import java.awt.Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandNavigate 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) 
	{
		//Enter the Browser
		WebDriver driver=new ChromeDriver();
		
		//Enter the URL and wait till it load
		driver.get("http://www.google.com");
		
		//Enter the URL and wait till it load
		driver.navigate().to("http://www.google.com");
		
		//go back to previous page
		driver.navigate().back();
		
		//go forward to next page
		driver.navigate().forward();
		
		//Refresh the current page
		driver.navigate().refresh();
	}

}
