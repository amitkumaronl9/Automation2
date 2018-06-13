package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementAndBottom 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/license.jsp");
		WebElement element=driver.findElement(By.xpath("//h2[contains(.,'Upgrades')]"));
		int x=element.getLocation().getX();
		int y=element.getLocation().getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
