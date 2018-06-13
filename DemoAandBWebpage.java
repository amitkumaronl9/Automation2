package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAandBWebpage {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/amitk/Desktop/DemoA.html");

		driver.findElement(By.id("t1")).sendKeys("qsp");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("qsp");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("a");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("b");
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t2")).sendKeys("b");
		
		driver.switchTo().defaultContent();
		WebElement element=driver.findElement(By.cssSelector(".c1"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("t2")).sendKeys("c");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1"));
		//also we can do this first switch inside the frame then come outside the frame
		/*driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("qsp");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("qsp");*/
	}

}
