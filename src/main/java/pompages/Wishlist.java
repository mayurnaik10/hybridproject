package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
	@FindBy(id="gdpr-cookie-accept")
	private WebElement cookiesbtn;
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//i[@class='fa fa-heart-o']")
	private WebElement addwishlistbtn;
	
	public Wishlist(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void cookiesbutton() {
		cookiesbtn.click();
	}
	public void play() {
		playbtn.click();
	}
	public void pause() {
		pausebtn.click();
	}
	public void addwishlistbutton() {
		addwishlistbtn.click();
	}

}
