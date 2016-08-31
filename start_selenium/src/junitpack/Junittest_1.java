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
	
	
	public void test_J1() throws InterruptedException {
		//fail("Not yet implemented");

		fd.manage().window().maximize();
	
        fd.get("https://www.wunderground.com/");	
	
       WebElement Login = fd.findElement(By.xpath("//a[@id='wuAccount']/i"));
         Login.click();
         
         System.out.println("The current page URL is ==="+ fd.getCurrentUrl());
       
	//fd.close();
	
	
	
	
	
	}

	public void closeB() throws InterruptedException{
		
		
		fd.close();
		
	}
	
	

	public void registeremail() {
		// TODO Auto-generated method stub
		WebElement email = fd.findElement(By.xpath("//input[@id='register-email']"));
        email.click();
        email.sendKeys("mobileqenoida@gmail.com");

        System.out.println("The current page URL is ==="+ fd.getCurrentUrl());
	}
	
}
