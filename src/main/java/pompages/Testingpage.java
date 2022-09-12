package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	@FindBy(id="Selenium Training")
	private WebElement seleniumtrainingbtn;
	
	public WebElement getSeleniumtrainingbtn() {
		return seleniumtrainingbtn;
	}

	public WebElement getMycartbtn() {
		return mycartbtn;
	}

	public WebElement getFacebookbtn() {
		return facebookbtn;
	}

	@FindBy(id="mycart")
	private WebElement mycartbtn;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookbtn;
	
	public Testingpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void facebookicon() {
		facebookbtn.click();
	}

}
