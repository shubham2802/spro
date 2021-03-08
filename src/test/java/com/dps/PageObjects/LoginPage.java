package com.dps.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver ldriver;
	
	By User=By.name("username");
	By Pwd=By.name("password");
	By login=By.id("user_login_btn");
	By logout1=By.xpath("//I[@title='User : SUHANI AGARWAL']");
	By logout2=By.xpath("(//I[@class='fa fa-sign-out'])[1]");
			
			
			
	public LoginPage(WebDriver rdriver) {
     this.ldriver=rdriver;
}

	public void SetUser(String Uname) {
    ldriver.findElement(User).sendKeys(Uname);
    }
	
	public void SetPass(String Password) {
	ldriver.findElement(Pwd).sendKeys(Password);
	}

    public void clickbtn() {
    ldriver.findElement(login).click();
    }
    
    public void logoutlink1() {
    ldriver.findElement(logout1).click();
    }
    public void logoutlink2() {
        ldriver.findElement(logout2).click();
}

}
