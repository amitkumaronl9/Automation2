package Jar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amitk/Desktop/Dish.html");
		WebElement element = driver.findElement(By.id("mtr"));
		Select dish=new Select(element);
		List<WebElement> list=dish.getOptions();
		int count=list.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) 
		{
			WebElement option=list.get(i);
			String s=option.getText();
			System.out.println(s);
			
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{

			e.printStackTrace();
		}
		driver.get("file:///C:/Users/amitk/Desktop/Drink.html");
		WebElement element2 = driver.findElement(By.id("slv"));
		Select drink=new Select(element2);
		List<WebElement> list2=drink.getAllSelectedOptions();
		int count2=list2.size();
		System.out.println(count2);
		for (int i = 0; i <count2; i++) 
		{
			WebElement option2=list2.get(i);
			String s1=option2.getText();
			System.out.println(s1);
			
		}
	}

}
