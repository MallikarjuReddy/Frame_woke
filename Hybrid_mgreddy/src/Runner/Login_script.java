package Runner;

import org.testng.annotations.Test;

import Generic_mg.Fetch_data;
import Generic_mg.Genaric_script;
import Pom.Pom;

public class Login_script extends Genaric_script
{
@Test
public void login() 
{
	String un=Fetch_data.Get_data("Sheet1", 0, 0);
	String pwd=Fetch_data.Get_data("Sheet1", 0, 1);
	Pom p = new Pom(driver);
	p.pasun(un);//mgreddy
	p.psw(pwd);
	p.login();
	
}
	
	}


