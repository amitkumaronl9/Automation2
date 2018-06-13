package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBradioButtonVerify 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	 public static void verifyElement(WebDriver driver,By b)
	  {
		  try
		  {
			  WebElement element=driver.findElement(b);
			  System.out.println("PASS:Element is Present");
			  if(element.isDisplayed())
			  {
				  System.out.println("PASS:Element is visible");
			  }
			  else
			  {
				  System.out.println("FAIL:Element is Hidden");
			  }
		  }
		  catch(Exception e)
		  {
			  System.out.println("FAIL:Element is Present");
		  }
	  }
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement radio=driver.findElement(By.xpath("u_0_4"));
		verifyElement(driver,By.id("u_0_4"));
		radio.click();
		if(radio.isSelected())
		{
			System.out.println("The radio button is selected");
		}
		else
		{
			System.out.println("The radio button is not selected");
		}
		
	}

}
