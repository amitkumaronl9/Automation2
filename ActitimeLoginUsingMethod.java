package Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginUsingMethod
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
	  		System.out.println("PAss");
	  	}
	  	else
	  	{
	  		System.out.println("Fail");
	  	}
	}
    public static void main(String args[])
    {
      WebDriver driver=new ChromeDriver();
      driver.get("http://localhost:8080/login.do");
      String expectedTitle="actiTIME - Login";
      verifyTitle(driver,expectedTitle);
      
      WebElement cb= driver.findElement(By.name("remember"));
      cb.click();
      if(cb.isSelected())
      {
    	  System.out.println("Checkbox is selected");
      }
      else
      {
    	  System.out.println("Checkbox is not selected");
      }
      WebElement unEnable=driver.findElement(By.id("username"));
      if(unEnable.isEnabled())
      {
    	  System.out.println("Username field is enable");
      }
      else
      {
    	  System.out.println("Username field is not enable");
      }
      
      WebElement element=driver.findElement(By.id("licenseLink"));
      String tag=element.getTagName();
      if(tag.equals("a"))
      {
    	  System.out.println("It is a link");
      }
      else
      {
    	  System.out.println("It is not a link");
      }
      String version="//nobr[contains(text(),'actiTIME')]";
      WebElement element2=driver.findElement(By.xpath(version));
      String versionName=element2.getText();
      System.out.println(versionName);
      
      String image="//img[contains(@src,'timer.png')]";
      WebElement element3=driver.findElement(By.xpath(image));
      String picture=element3.getTagName();
      if(picture.equals("img"))
      {
    	  System.out.println("It is a Image");
      }
      else
      {
    	  System.out.println("It is not a Image");
      }
      
      
      
   	String xp="//div[.='Login ']";
 	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath(xp)).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	String expectedTitle2="actiTIME - Enter Time-Track";
	verifyTitle(driver,expectedTitle2);
	try 
	{
		Thread.sleep(2000);
	} catch (InterruptedException e)
	{
		e.printStackTrace();
	}
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
	driver.findElement(By.xpath(homePage)).click();
	
    }

}
