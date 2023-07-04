package Generic_mg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genaric_script implements Framwork_constant
{
	public WebDriver driver;
@BeforeMethod 
public void open_app() throws InterruptedException 
{
	System.setProperty(gecko_key,gecko_value);
	driver = new FirefoxDriver();
	driver.get(url);
	Thread.sleep(1000);
	Assert.fail();
}
@AfterMethod
public void clos_app(ITestResult res)
{
if (ITestResult.FAILURE==res.getStatus())	{
	Screenshot.takesceen(driver);
}
driver.close();
}}
