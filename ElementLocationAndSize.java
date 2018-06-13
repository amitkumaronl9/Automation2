package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocationAndSize 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		WebElement element=driver.findElement(By.id("username"));
		int x=element.getLocation().getX();
		System.out.println(x);
		int y=element.getLocation().getY();
		System.out.println(y);
		
		int height=element.getSize().getHeight();
		System.out.println(height);
		int Width=element.getSize().getHeight();
		System.out.println(Width);
		
		WebElement element1=driver.findElement(By.id("username"));
		WebElement element2=driver.findElement(By.name("pwd"));
		int x1=element1.getLocation().getX();
		int x2=element2.getLocation().getX();
		if(x1==x2)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		int x3=element1.getSize().getHeight();
		int x4=element2.getSize().getHeight();
		
		int x5=element1.getSize().getWidth();
		int x6=element2.getSize().getWidth();
		
		if(x3==x4&&x5==x6)
		{
			System.out.println("Height and Width is same");
		}
		else
		{
			System.out.println("Height and Width is not same");
		}
		
		
		
		
	}

}
