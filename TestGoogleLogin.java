package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleLogin {
	static
	{
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com/");
	GoogleLogin links=new GoogleLogin(driver);
	links.getAllLinks();
	
	}
	

}
