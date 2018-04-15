package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.Loginpage;

public class InvalidLogin extends BaseTest {
	@Test(priority=2)
	public void testInvalidLogin(){
		String un=Excel.getdata(XL_PATH, "InvalidLogin",1, 0);
		String pw=Excel.getdata(XL_PATH, "InvalidLogin",1, 1);
		String msg=Excel.getdata(XL_PATH, "InvalidLogin",1, 2);
		
	Loginpage l=new Loginpage(driver);
	l.setUserName(un);
	l.setPassword(pw);
	l.clickLogin();
	l.verifyErrMsg(msg);
}
}
