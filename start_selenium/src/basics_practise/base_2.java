package basics_practise;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Keys.chord(Keys.CONTROL, 0)
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		cap.setCapability("ignoreZoomSettings", true);
		cap.setCapability("EnableNativeEvents", false);
	
		
		System.setProperty("webdriver.ie.driver", "C://IEDriverServer/IEDriverServer.exe");
		
	WebDriver IEdriver = new InternetExplorerDriver(cap);
	
		IEdriver.get("http://www.starling.com");
		
	String i= IEdriver.getCurrentUrl();
	
	System.out.println(i);
	
	IEdriver.close();
	
	
	
	
	
	
	
	
	
	
	
	}



























}
