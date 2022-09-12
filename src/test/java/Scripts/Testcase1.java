package Scripts;

import org.testng.annotations.Test;

import Genericlibrary.BaseClass;
import pompages.Addtocart;
import pompages.SkillraryLoginPage;
import pompages.Skillrarydemologinpage;

public class Testcase1 extends BaseClass{
	@Test 
	public void tc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		utilies.switchingtabs(driver);
		Skillrarydemologinpage sd=new Skillrarydemologinpage(driver);
		utilies.mousehover(driver, sd.getCoursebtn());
		sd.seleniumtrainingbutton();
		
		Addtocart ac=new Addtocart(driver);
		utilies.doubleclick(driver, ac.getAddbtn());
		ac.addtocartbutton();
		utilies.alertpopup(driver);
	}
	

}
