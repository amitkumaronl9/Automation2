package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage 
{
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement logbutton;
	
	public ActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setUn(String username) 
	{
		un.sendKeys(username);
	}

	public void setPass(String password) 
	{
		pass.sendKeys(password);
	}

	public void Logbutton() 
	{
		logbutton.click();
	}
}

