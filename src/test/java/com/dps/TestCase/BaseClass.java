package com.dps.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.dps.Utilities.ReadConfig;

public class BaseClass {
	ReadConfig read=new ReadConfig();
	
	String baseURL=read.getappurl();
	String username=read.getusername();
	String password=read.getpassword();
	public static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass
	
	public void setup(String br) throws InterruptedException {
		
		if (br.equals("chrome"))
		 
		{ 
			System.setProperty("webdriver.chrome.driver",read.getchromepath());
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		}
		
	if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",read.getfirepath());
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	
	}
	
	if (br.equals("msedge"))
	{
		System.setProperty("webdriver.msedge.driver",read.getedgepath());
	    driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
	
	driver.get(baseURL);
	
	}
	
	
	@AfterClass
	
	public void teardown() {
		driver.quit();
	}

}
