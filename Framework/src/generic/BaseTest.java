package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst{
	public WebDriver driver;
	static{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		
	}
@BeforeMethod
public void OpenApplication(){
	driver=new ChromeDriver();
	String appURL=Autoutil.getproperty(CONFIG_PATH, "appURL");
	driver.get(appURL);
	String SITO=Autoutil.getproperty(CONFIG_PATH, "ITO");
	long ITO=Long.parseLong(SITO);
	driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	
	
}
@AfterMethod
public void CloseApplication(ITestResult r){
	String testname=r.getName();
	int status=r.getStatus();
	if(status==2){
		Autoutil.getphoto(driver, PHOTO_PATH, testname);
	}
	driver.quit();
			
	
}

}
