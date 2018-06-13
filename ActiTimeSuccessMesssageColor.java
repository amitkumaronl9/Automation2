jpackage Jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.Color;


public class ActiTimeSuccessMesssageColor 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		String expectedTitle="actiTIME - Login";
	    verifyTitle(driver,expectedTitle);
		String xp="//div[.='Login ']";
	 	driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath(xp)).click();
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		String homepage="actiTIME - Enter Time-Track";
		verifyTitle(driver, homepage);
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[.='TASKS']")).click();
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[contains(@class,'createNewCustomer')]")).click();
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
        //verifyElement(driver,By.xpath("//input[@id='customerLightBox_nameField']"));
        
        //String s="//span[@id='customerLightBox_titlePlaceholder']/../../../../../../div[1]/div[1]/div[1]/input";
        //verifyElement(driver,By.xpath("//input[@id='customerLightBox_nameField']"));
        WebElement element=driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']"));
		element.sendKeys("Amit Kuma");
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[.='Create Customer']")).click();
		String color="//*[contains(text(),'created')]";
		WebElement element2=driver.findElement(By.xpath(color));
		String clr=element2.getCssValue("color");
		System.out.println(clr);
		String Hexa=Color.fromString(clr).asHex();
		System.out.println(Hexa);
	
		
		
	}

	private static void verifyElement(WebDriver driver, By xpath) 
	{
		try
		{
			WebElement expected=driver.findElement(xpath);
			System.out.println("Element is present");
			if(expected.isDisplayed())
			{
				System.out.println("Element is displayed");
			}
			else
			{
				System.out.println("Element is Hidden");	
			}
			expected.click();
		}
		catch(Exception e)
		{
			System.out.println("Element is not Present");
		}
		
		
	}

	private static void verifyTitle(WebDriver driver, String expectedTitle)
	{
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle))
        {
        	System.out.println("Login page is displayed");
        }
        else
        {
        	System.out.println("Login page is not displayed");
        }
		
	}
}
