package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amitk/Desktop/xpath.html");
		driver.findElement(By.xpath("./html/body/input[1]")).sendKeys("Amit");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Kumar");
	}

}
