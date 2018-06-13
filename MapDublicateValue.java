package Jar;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MapDublicateValue
{
	static
	{
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\\\Users\\\\amitk\\\\Desktop\\\\Dish.html");
	WebElement list=driver.findElement(By.id("mtr"));
	Select select=new Select(list);
	List<WebElement> element=select.getOptions();
	Map<String,Integer> map=new LinkedHashMap<String,Integer>();
	int v=0;
	for (int i = 0; i < element.size(); i++) 
	{
		String key=element.get(i).getText();
		if(map.containsKey(key))
		{
			Integer r=map.get(key);
			v++;
			map.put(key,v);
		}
		else
		{
			map.put(key, 1);
		}
	}
	/*Set<String> allKeys=map.keySet();
	for(String key:allKeys)
	{
		Integer v1=map.get(key);
		System.out.println(key+"-"+v1);
	}
	driver.close();*/
	Set<String> allKeys=map.keySet();
	for(String key:allKeys)
	{
		System.out.println(key);
	}
	for(String key:allKeys)
	{
		Integer v1=map.get(key);
		if(v1==1)
		{
			System.out.println(key);
		}
	}
}
	
	

}
