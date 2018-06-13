package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebpageDisableElementandScroll
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amitk/Desktop/SampleWebpage.html");
		WebElement box=driver.findElement(By.id("t1"));
		box.clear();
		box.sendKeys("Bye");
		Boolean b=box.isEnabled();
		System.out.println(b);
		WebElement box2=driver.findElement(By.id("t2"));
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//Alternative for sendKeys
		j.executeScript("document.getElementById('t2').value='Amit'");
		//Alternative for clear
		j.executeScript("document.getElementById('t2').value=''");
		//Alternative for click
		j.executeScript("document.getElementById('t2').click()");
		Boolean b2=box2.isEnabled();
		System.out.println(b2);
	}

}
