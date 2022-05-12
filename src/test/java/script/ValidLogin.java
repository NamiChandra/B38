package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class ValidLogin extends BaseTest{

	@Test(priority = 1,groups = {"smoke"})
	public void testValidLogin() {
//		1.	Enter valid user name (admin)
		test.info("	Enter valid user name (admin)");
		LoginPage loginPage=new LoginPage(driver);  
		loginPage.setUserName("admin");
		
//		2.	Enter valid password (manager)
		test.info("Enter valid password (manager)");
		loginPage.setPassword("damager");
		
//		3.	Click on login button
		test.info("Click on login button");
		loginPage.clickLoginButton();
		
//		4.	Verify that home page is displayed
		test.info("Verify that home page is displayed");
		EnterTimeTrackPage ettPage=new EnterTimeTrackPage(driver);
		boolean result = ettPage.verifyPageTitle(wait, "actiTIME - Enter Time-Track");
		Assert.assertTrue(result, "Home page is not displayed");
		test.pass("home page is displayed");
		//true--title is matching- home page is displayed--PASS
		//false-title is not matching --home page is not displayed-FAIL
	}
}
