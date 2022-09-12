package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Genericlibrary.BaseClass;
import pompages.Corejavaforselenium;
import pompages.SkillraryLoginPage;
import pompages.Wishlist;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchtbox(pdata.getpropertydata("coursedata"));
		s.gobutton();
		
		Corejavaforselenium cj=new Corejavaforselenium(driver);
		cj.corejavabutton();
		
		Wishlist w=new Wishlist(driver);
		Thread.sleep(3000);
		w.cookiesbutton();
		utilies.switchframe(driver);
		w.play();
		Thread.sleep(3000);
		w.pause();
		utilies.switchbackframe(driver);
		w.addwishlistbutton();
	
	
		
		
	}
	}


