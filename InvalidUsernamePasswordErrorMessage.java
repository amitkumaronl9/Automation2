package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidUsernamePasswordErrorMessage 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void verifyTitle(WebDriver driver,String expectedTitle)
	{
		System.out.println(expectedTitle);
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	    if(expectedTitle.equals(actualTitle))
	  	{
	  		System.out.println("PASS");
	  	}
	  	else
	  	{
	  		System.out.println("FAIL");
	  	}
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
    public static void main(String args[])
    {
      WebDriver driver=new ChromeDriver();
      driver.get("http://localhost:8080/login.do");
      String expectedTitle="actiTIME - Login";
      verifyTitle(driver,expectedTitle);
      
      String xp="//div[.='Login ']";
   	driver.findElement(By.name("username")).sendKeys("amit");
  	driver.findElement(By.name("pwd")).sendKeys("kumar");
  	driver.findElement(By.xpath(xp)).click();
  	try
  	{
		Thread.sleep(3000);
	} catch (InterruptedException e) 
  	{
		e.printStackTrace();
	}
  	verifyElement(driver,By.xpath("//span[contains(text(),'invalid')]"));
  	driver.close();
  	
  	
    }

}
