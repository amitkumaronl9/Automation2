package Jar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableValuesPrint
{
	static
	{
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\amitk\\Desktop\\Selenium Webpages\\Selinium assignment3.html");
	List<WebElement> list= driver.findElements(By.tagName("tr"));
	int count=list.size();
	System.out.println(list.size());
	for (int i = 0; i <count; i++) 
	{
		WebElement element= list.get(i);
		String s=element.getText();
		System.out.println(s);
	}
}
}
