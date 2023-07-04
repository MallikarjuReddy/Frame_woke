package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_mg.Base_script;

public class Pom extends Base_script
{
	@FindBy(id="email")
	WebElement ele1;
	
	@FindBy(id="pass")
	WebElement ele2;
	
	@FindBy(name="login")
	WebElement ele3;

public Pom (WebDriver driver)
{
	super(driver);
}
public void pasun(String un) 
{
	ele1.sendKeys(un);
}
public void psw(String pw) 
{
	ele2.sendKeys(pw);
}
public void login() 
{
	ele3.click();
}
}
