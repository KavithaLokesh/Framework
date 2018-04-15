package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTTPage;
import page.Loginpage;

public class ValidLogin extends BaseTest{
@Test(priority=1)
public void testValidLogin(){
	String un=Excel.getdata(XL_PATH, "ValidLogin",1, 0);
	String pw=Excel.getdata(XL_PATH, "ValidLogin",1, 1);
	String eTitle=Excel.getdata(XL_PATH, "ValidLogin",1, 2);
	
Loginpage l=new Loginpage(driver);
l.setUserName(un);
l.setPassword(pw);
l.clickLogin();
EnterTTPage e=new EnterTTPage(driver);
e.VerifyPageIsDisplayed(driver, eTitle);
}
}
                         
