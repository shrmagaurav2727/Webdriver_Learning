package junitpack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class junitPack_2  extends Junittest_1{
//static 	WebDriver fd = new FirefoxDriver();
	
	static Junittest_1 J1 = new junitPack_2();
	
	@BeforeClass
	  public static void beforetest()throws InterruptedException{
		
		
//		fd.manage().window().maximize();
//		fd.get("https://www.wunderground.com/");
		
		 
		 J1.test_J1();
		Thread.sleep(3000);
	}
	
	
	
	@AfterClass 	
	
	public static void aftertest() {
		
		try {
			J1.closeB();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Ignore
	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");
		
	
	     	J1.registeremail();
	 
	Thread.sleep(3000);
	     	
	
	}
        
        
        
        
        
        
      @Test (expected= NoSuchElementException.class)
      public void test1()  {
    	  
    	  WebElement Location =fd.findElement(By.xpath("//input[@id='register-handle']"));
    	   Location.click();
    	  Location.sendKeys("MobileQE");
    	  
    	  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
        
      
      
      @Test(expected= NoSuchElementException.class)
      public void test2()  {
    	  
    	  WebElement Passwrd = fd.findElement(By.id("register-password"));
    	   Passwrd.click();
    	  Passwrd.sendKeys("Noida12!");;
    	  
    	  try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
      }
      
      
	}
