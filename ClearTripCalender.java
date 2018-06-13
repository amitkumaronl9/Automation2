package Jar;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripCalender
{
	static
	{
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		WebElement element=driver.findElement(By.id("DepartDate"));
		element.click();
		LocalDate date=LocalDate.now();
		LocalDate s=date.plusDays(1);
		String str=s.toString();
		String day[]=str.split("-");
		System.out.println(day.length);
		System.out.println(day[2]);
		System.out.println(s);
		String str1=day[2];
		driver.findElement(By.linkText(str1)).click();
		
		
		
		
	}

}
