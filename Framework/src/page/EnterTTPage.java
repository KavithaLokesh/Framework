package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class EnterTTPage extends Basepage{
	@FindBy(xpath=".//div[contains(text(),'Help')]")
	private WebElement help;
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutAT;
	@FindBy(css="span.productVersion")
	private WebElement version;
	@FindBy(id="aboutPopupCloseButtonId")
   private WebElement closeBtn;
	@FindBy(id="logouLink")
	private WebElement logoutLink;
	
	public EnterTTPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickHelp(){
		help.click();
	}
	
	public void clickAboutActiTIME(){
		aboutAT.click();
	}
	public void verifyVersion(String eText){
		verifyText(version,eText);
	}
	public void clickCloseButton(){
		closeBtn.click();
	}
	public void clicklogout(){
		logoutLink.click();
	}
}
