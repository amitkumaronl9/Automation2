package Jar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxValuesPrinting 
{
	static
	{
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\amitk\\Desktop\\Dish.html");
	WebElement element=driver.findElement(By.id("mtr"));
	Select select=new Select(element);
	List<WebElement> list=select.getOptions();
	ArrayList<String> ar=new ArrayList<String>();
	for (int i = 0; i < list.size(); i++) 
	{
		String text=list.get(i).getText();
		ar.add(text);
	}
	Collections.sort(ar);
	for(String s:ar)
	{
		System.out.println(s);
	}
	ArrayList<String> clone=new ArrayList<String>(ar);
	if(clone.equals(ar))
	{
		System.out.println("It is sorted");
	}
	else
	{
		System.out.println("It is not sorted");
	}
	
}

}
