package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import Genericlibrary.BaseClass;
import pompages.SkillraryLoginPage;
import pompages.Skillrarydemologinpage;
import pompages.Testingpage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		Skillrarydemologinpage sd=new Skillrarydemologinpage(driver);
		utilies.switchingtabs(driver);
		utilies.dropdown(sd.getSelectcategorybtn(), pdata.getpropertydata("selectcategorybtn"));
		
		Testingpage t=new Testingpage(driver);
		utilies.draganddrop(driver, t.getSeleniumtrainingbtn(), t.getMycartbtn());
		Point loc = t.getFacebookbtn().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		utilies.scrollbar(driver,x , y);
		t.facebookicon();
		
	}
	

}
