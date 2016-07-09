package junitpack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junittest_1 {

	WebDriver fd = new FirefoxDriver();
	
	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");

		fd.manage().window().maximize();
	
        fd.get("http://www.accuwether.com");	
	
       WebElement Cookie = fd.findElement(By.xpath(".//*[@id='lnk-eu-cookie-learn']"));
         Cookie.click();
         
         System.out.println("The current page URL is ==="+ fd.getCurrentUrl());
       
	fd.close();
	
	
	
	
	
	
	}

}
