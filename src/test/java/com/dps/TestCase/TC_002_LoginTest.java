package com.dps.TestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dps.PageObjects.LoginPage;
import com.dps.Utilities.XLUtils;




public class TC_002_LoginTest extends BaseClass {

	
@Test(dataProvider="LoginData")
public void LoginDDT(String user,String pwd) throws InterruptedException {

	LoginPage obj=new LoginPage(driver);
   
	obj.SetUser(user);
	obj.SetPass(pwd);
	obj.clickbtn();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  String url=driver.getCurrentUrl();
  Assert.assertEquals("https://dpsharidwar.edunexttech.com/StudentDashboardApp/StudentHome", url);
  
	
	
	
	
	
	
//if(isalertpresent()==true)
//	{
//		driver.switchTo().alert().dismiss();
//		Assert.assertTrue(true);
	//obj.logoutlink1();
	obj.logoutlink2();
	
	driver.switchTo().defaultContent();
//	}
  // 
//else
//	{
	    //driver.switchTo().defaultContent();
		//Assert.assertTrue(false);
	//	driver.manage().deleteAllCookies();
	//}
	
	

//}
	
	
	//public boolean isalertpresent() 
	//{  
	// try
	
	//  {
	//	driver.switchTo().alert();
	//   return true;
	//   }
	
   // // catch	(NoAlertPresentException e)
	//{
	//return false;
	//}
	
	
}
	
	


@DataProvider (name="LoginData")
	
   String [][] getdata() throws IOException{
   String path=System.getProperty("user.dir")+"/src/test/java/com/dps/TestData/Book2.xlsx";
   int rwcount=XLUtils.getrow(path, "Sheet1");
   int colcount=XLUtils.getcell(path, "Sheet1", 1);
   
   String logindata[][]=new String[rwcount][colcount];
	 
for (int i=1;i<=rwcount;i++)
    {
	for(int j=0;j<colcount;j++)
	{
	logindata[i-1][j]=XLUtils.getcelldata(path, "Sheet1", i, j);
	
	}
	
	}
return logindata;

}


}
