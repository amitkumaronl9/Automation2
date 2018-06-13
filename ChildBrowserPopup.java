package Jar;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> w=driver.getWindowHandles();
		System.out.println(w.size());
		for(String c:w)
		{
			driver.switchTo().window(c);
			String title=driver.getTitle();
			System.out.println(title);
			driver.quit();
		}
		/*for(String c:w)
		{
			driver.switchTo().window(c);
			driver.close();//it will close all the browser one by one like parent then child browser
		}*/
		for(String c:w)
		{
			driver.switchTo().window(c);
		}
		driver.close();//it will close the current browser
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		System.out.println("Starting.....");
		Boolean found=false;
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.id("licenseLink")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> w1=driver.getWindowHandles();
		System.out.println(w1.size());
		for(String c:w1)
		{
			driver.switchTo().window(c);
			String title2=driver.getTitle();
			System.out.println(title);
			if(title2.equals("title"))
			{
				found=true;
				driver.close();
			}
			else
			{
				System.out.println("Window Title not Match");
			}
		}
	}

}
