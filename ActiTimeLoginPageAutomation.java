package Jar;

import org.apache.xerces.dom.PSVIDOMImplementationImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginPageAutomation
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
    public static void main(String args[])
    {
    	WebDriver driver=new ChromeDriver();
    	driver.get("http://localhost:8080/login.do");
        String expectedTitle="actiTIME - Login";
    	String actualTitle=driver.getCurrentUrl();
    	if(expectedTitle.equals(actualTitle))
    	{
    		System.out.println("PASS");
    	}
    	else
    	{
    		System.out.println("Fail");
    	}
 
    	//1>way to use 
    	String xp="//div[.='Login ']";
    	
    	//2>way to use
    	/*String expectedResult="login";
    	String actualResult=driver.getCurrentUrl();
    	if(actualResult.contains(expectedResult))
    	{
    		System.out.println("PASS");
    	}
    	else
    	{
    		System.out.println("FAIL");
        }*/

       // 3>way to use
    	/*try
    	{
          WebElement loginButton =driver.findElement(By.xpath(xp));
          System.out.println("PASS");
    	}
    	catch(NoSuchElementException e)
    	{
    		System.out.println("FAIL");
    	}*/
    	driver.findElement(By.name("username")).sendKeys("admin");
    	driver.findElement(By.name("pwd")).sendKeys("manager");
    	driver.findElement(By.xpath(xp)).click();
    	
    	String homePage="//a[@id='logoutLink']";
    	try
    	{
    	WebElement logoutButton=driver.findElement(By.xpath(homePage));
    	System.out.println("LOGOUT BUTTON FOUND");
    	}
    	catch(NoSuchElementException e)
    	{
    		System.out.println("LOGOUT BUTTON NOT FOUND");
    	}
    	try 
    	{
			Thread.sleep(2000);
		} catch (InterruptedException e)
    	{
			e.printStackTrace();
		}
    	driver.findElement(By.xpath(homePage)).click();
    	if(expectedTitle.equals(actualTitle))
    	{
    		System.out.println("PASS");
    	}
    	else
    	{
    		System.out.println("Fail");
    	}
    	
    	
      
      
    }

}
