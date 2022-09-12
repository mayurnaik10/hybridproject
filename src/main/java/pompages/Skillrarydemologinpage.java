package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrarydemologinpage {
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(name="addresstype")
	private WebElement selectcategorybtn;
	
	public WebElement getSelectcategorybtn() {
		return selectcategorybtn;
	}
	public WebElement getCoursebtn() {
		return coursebtn;
	}

	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtrainingbtn;
	
	public Skillrarydemologinpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void seleniumtrainingbutton() {
		seleniumtrainingbtn.click();
	}
	

}
