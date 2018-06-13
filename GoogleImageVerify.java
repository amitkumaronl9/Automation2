package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImageVerify 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=pL0EWuOSHOqK8Qej0bzQAg&gws_rd=ssl");
	    
	
	    WebElement element=driver.findElement(By.id("hplogo"));
	    String image=element.getTagName();
	    if(image.equals("img"))
	    {
	    	System.out.println("It is a image");
	    }
	    else
	    {
	    	System.out.println("It is not a image");
	    }
	    
	}
}
