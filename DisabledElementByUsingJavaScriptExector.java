package Jar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElementByUsingJavaScriptExector 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("C:\\Users\\amitk\\Desktop\\Disable.html");
       JavascriptExecutor j=(JavascriptExecutor)driver;
       j.executeScript("document.getElementById('amit').value='qsp'");
       
	}

}
