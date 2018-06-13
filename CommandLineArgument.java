package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandLineArgument 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		WebElement un=driver.findElement(By.cssSelector("#username"));
		j.executeScript("arguments[0].value=arguments[1]",un,"admin");
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		j.executeScript("arguments[0].value=arguments[1]",password,"manager");
		WebElement login=driver.findElement(By.xpath("//div[.='Login ']"));
		j.executeScript("arguments[0].click()",login);
		
	}

}
