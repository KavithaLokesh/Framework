package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Basepage;

public class Loginpage extends Basepage {
@FindBy(id="username")
private WebElement unTB;

}
