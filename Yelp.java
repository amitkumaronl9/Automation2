package Jar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yelp 
{
	@FindBy(xpath="//div[@title='4.0 star rating']/../..//h3//span//a//span")
	private List<WebElement> list;
	public Yelp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void getText()
	{
	   String a="";
	  for(WebElement e:list)
	  {
	   a=e.getText();
	   System.out.println(a);
	  }
	}
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yelp.com/");
		driver.findElement(By.id("find_desc")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try
		{
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) 
		{
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Yelp y=new Yelp(driver);
		y.getText();
		//The below code is not working because The page is refreshing after loading page automatically so by that adress is also refreshed and we get 
		//a beautiful exception statleElementReferenceException.
	   /* System.out.println(driver.findElement(By.xpath("//div[@title='4.0 star rating']/../..//h3//span//a//span")).getText());*/
		
		/*List<WebElement> list=driver.findElements(By.xpath("//div[@title='4.0 star rating']"));
		for(WebElement li:list)
		{
		WebElement element=li.findElement(By.xpath("//div[@title='4.0 star rating']/../..//h3//span//a//span"));
		String s=element.getText();
		System.out.println(s);
		}*/
		
	}
}
