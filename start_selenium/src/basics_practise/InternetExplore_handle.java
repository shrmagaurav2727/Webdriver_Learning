package basics_practise;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplore_handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.ie.driver", "C://IEDriverServer/IEDriverServer.exe");
		
		WebDriver IEDriver = new InternetExplorerDriver();
		IEDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		DesiredCapabilities cap = new DesiredCapabilities().internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setCapability("EnableNativeEvents", false);
		cap.setCapability("IgnoreZoomSettings", true);
		
		IEDriver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0")); 
		
		IEDriver.get("http://www.accuweather.com");
		
		//IEDriver.navigate().to("javascript:document.getElementById('overridelink').click()");
		
		IEDriver.getTitle();
		
		
		
		
		
		
		
		
	}

}


		
		