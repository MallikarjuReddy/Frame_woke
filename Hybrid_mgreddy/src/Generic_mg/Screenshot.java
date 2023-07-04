package Generic_mg;

import java.io.File;

import javax.lang.model.element.Modifier;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot 
{
public static void  takesceen(WebDriver driver)
{try {
	

TakesScreenshot tcc=(TakesScreenshot)driver;
File src= tcc.getScreenshotAs(OutputType.FILE);
File dtr=new File("./sceenshot+.png"); 
FileHandler.copy(src, dtr);
}
catch( Exception e) {
	System.out.println(e);
}

}}