package Jar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListSampleTextandAttributeofAllTheLinksPageExample 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\amitk\\Desktop\\Demo.html");
		List<WebElement> list=driver.findElements(By.xpath("//a"));
		int count=list.size();
		System.out.println(count);
		int visible=0;
		for(int i=0;i<count;i++)
		{
		WebElement element=list.get(i);
		if(element.isDisplayed())
		{
		String s=element.getText();
		System.out.println(s);
		visible++;
		}
		}
		System.out.println(visible);
		for(WebElement element:list)
		{
			String s=element.getAttribute("href");
			System.out.println(s);
		}
		driver.close();
	}

}
