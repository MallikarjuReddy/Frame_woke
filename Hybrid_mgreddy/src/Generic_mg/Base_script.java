package Generic_mg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_script extends Genaric_script
{
public Base_script(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
