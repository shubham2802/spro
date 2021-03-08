package com.dps.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dps.PageObjects.LoginPage;


public class TC_001_LoginTest extends BaseClass {

	
	
    @Test

	
	void LoginTest() throws InterruptedException {
    	
    	
		LoginPage obj=new LoginPage(driver);
		obj.SetUser(username);
		obj.SetPass(password);
		obj.clickbtn();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		
	Assert.assertEquals(url, "https://dpsharidwar.edunexttech.com/StudentDashboardApp/StudentHome");
	
	
	
	
    }
}
