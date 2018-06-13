package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumWebPageRubyVersionVerify 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumhq.org/download/");
		
		String version="//td[.='Ruby']/../td[2]";
		WebElement element=driver.findElement(By.xpath(version));
		String versionName=element.getText();
		System.out.println(versionName);
	}

}
