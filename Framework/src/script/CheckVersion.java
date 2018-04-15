package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTTPage;
import page.Loginpage;

public class CheckVersion extends BaseTest{
	WebDriver driver;
	WebElement e;

	@Test(priority=3)
	public void testCheckVersion(){
		String un=Excel.getdata(XL_PATH, "CheckVersion",1, 0);
		String pw=Excel.getdata(XL_PATH, "CheckVersion",1, 1);
		String version=Excel.getdata(XL_PATH, "CheckVersion",1, 2);
		
	Loginpage l=new Loginpage(driver);
	l.setUserName(un);
	l.setPassword(pw);
	l.clickLogin();
	EnterTTPage e1=new EnterTTPage(driver);
	e1.clickHelp();
	e1.clickAboutActiTIME();
	e1.verifyText(e, version);
	e1.clickCloseButton();
	e1.clicklogout();
	
}
}
