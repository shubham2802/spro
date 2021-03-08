package com.dps.TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://dpshardwar.com/");
         driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(3000);
	driver.findElement(By.xpath("//A[@class='close-reveal-modal'][text()='×']")).click();
	
	
	
	
	
	}

}
