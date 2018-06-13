package Jar;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) 
	{
		//set the path of driver executable
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";		
		System.setProperty(key,value);
		//open browser
		ChromeDriver driver=new ChromeDriver();
		//close the browser
		driver.close();
	}

}
