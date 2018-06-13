package POMCLASS;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleLogin 
{
	@FindBy(xpath="//a")
	private List<WebElement> list;
	
	public GoogleLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void getAllLinks()
	{
		int count=list.size();
		System.out.println(count);
	}

}
