package junitpack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class junitPack_2 {
	WebDriver foxd = new FirefoxDriver();
	
	
	@Before
	  public void beforetest(){
		
		
		foxd.manage().window().maximize();
		foxd.get("http://www.accuweather.com");
		
	}
	
	
	
	
	
	
	@Test
	public void test() throws InterruptedException {
		fail("Not yet implemented");
		WebElement Cookie = foxd.findElement(By.xpath(".//*[@id='lnk-eu-cookie-learn']"));
        Cookie.click();
        
        System.out.println("The current page URL is ==="+ foxd.getCurrentUrl());
	
	
	}




































}
