package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActiTimeLoginPage 
{
	static
	{
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8080/login.do");
	ActiTimeLoginPage login=new ActiTimeLoginPage(driver);
	login.setUn("admin");
	login.setPass("manager");
	login.Logbutton();
	}
	

}
