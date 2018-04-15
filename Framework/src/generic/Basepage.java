package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage {
public void VerifyPageIsDisplayed(WebDriver driver,String eResult){
	String SETO=Autoutil.getproperty(IAutoConst.CONFIG_PATH, "ETO");
	long ETO=Long.parseLong(SETO);
	WebDriverWait wait=new WebDriverWait(driver,ETO);
	try{
		wait.until(ExpectedConditions.titleIs(eResult));
		Reporter.log("PASS:Expected page is displayed", true);
	}
catch(Exception e){
	Reporter.log("FAIL:Expected page is not displayed",true);
	Assert.fail();
}
	
	
	
}
public void verifyText(WebElement e,String eText){
	String aText=e.getText();
	Assert.assertEquals(aText, eText);
	
}
}
