package Framework.Hybrid.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
@Test
public class FlightFinder {
	
	WebDriver driver;
	
	FlightFinder(WebDriver driver){
	this.driver=driver;
	}
    By type=By.name("tripType");
    By passengers=By.name("passCount");
	By Departingfrom =By.name("fromPort");
    By frommonth=By.name("fromMonth");
	By fromDay =By.name("fromDay");
   By Arrivingin=By.name("toPort");
   By toMonth=By.name("toMonth");
   By toDay=By.name("toDay");
   By servClass=By.name("servClass");
   By airline=By.name("airline");
   By  findFlights=By.name(" findFlights");
   
   public WebElement Type(){
	   return driver.findElement(type);
   }
   public WebElement Passengers(){
	   return driver.findElement(passengers);
   }
   public WebElement Departing_From(){
	   return driver.findElement(Departingfrom);
   }
   public WebElement Departing_on_month(){
	   return driver.findElement(frommonth);
   }
   
   public WebElement Departing_on_Day(){
	   return driver.findElement(fromDay);
   }
   public WebElement Arriving_in(){
	   return driver.findElement( Arrivingin);
   }
   public WebElement Returning_toMonth(){
	   return driver.findElement( toMonth);
   }
   public WebElement Returning_toDay(){
	   return driver.findElement(toDay);
   }
   public WebElement serviceClass(){
	   return driver.findElement(servClass);
   }
   public WebElement airline(){
	   return driver.findElement(airline);
   }
   public WebElement continue_findflights(){
	   return driver.findElement(findFlights);
   }
   public void closebrowser(){
	   driver.quit();
   }
   
   
   
   
   
   
}