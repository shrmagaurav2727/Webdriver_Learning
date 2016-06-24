import java.awt.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.xerces.util.SynchronizedSymbolTable;
import org.apache.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class brokenlinks {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

   WebDriver Fdriver = new FirefoxDriver();
	
	 Fdriver.manage().window().maximize();
	
	Fdriver.get("http://www.accuweather.com");
	
	Fdriver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	  java.util.List<WebElement>  TotLinks =  Fdriver.findElements(By.tagName("a"));
	     System.out.println(TotLinks.size());
	
	     
	         // Trying to print 
	     boolean isValid = false;
	     
	     for (int i=1; i<=TotLinks.size();i++)
	     
	     {
	    	 
	    	 
	    	 String url = TotLinks.get(i).getAttribute("href");
	    			
	    	 System.out.println(url);
	    	 
	    	 isValid = getResponseCode(url); 
	    	 
	    	 
	    	 if (isValid) {
           	  
	               System.out.println("VALID LINK "+ url);	            	  
		            	  
		            	 System.out.println("XXXXXXXXX-------------XXXXXXXXXXXX--------------XXXXXXXXX-------------XXXXXXXXXX"); 
	               
		            	 System.out.println();
	    	 } else {
	    		 
	    		 System.out.println("Broken link is "+ url);
		            	 
		            	 System.out.println("YYYYYYYY---------YYYYYYYYYYYY-------------YYYYYYYYYYYYYYY_---------------YYYYYYYYYYYYY");
		            	  
		            	 System.out.println();
		            	  continue;
		              }
		
	    	 
	    	 
	  	}
	     
	              Fdriver.close();
	     
	     
	
	
	
	
	}
	     
	     
	     
          	
	
	
	
	

	









	
public static boolean getResponseCode(String chkurl){	

boolean validResponse = false;

try
{
	
HttpResponse urlrsp = new DefaultHttpClient().execute(new HttpGet(chkurl));

int respCode = urlrsp.getStatusLine().getStatusCode();

System.out.println("Response Code is "+ respCode);


if((respCode==404) || (respCode == 505))
{
	
   validResponse = false;
		   
}
else 
{
	
	validResponse = true ;

}}

catch(Exception e){


}

return validResponse;


}



}





















