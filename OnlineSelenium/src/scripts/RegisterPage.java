package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// cannot handle dynamic xpath
	@FindBy(xpath="") private WebElement genderRadioButton;

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}
	
	
}
