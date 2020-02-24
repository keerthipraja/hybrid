package Framework.Hybrid.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightConformation {
	WebDriver driver;
	FlightConformation(WebDriver driver){
		this.driver=driver;
	}
	
	By BackToFlights =By.xpath("//img[@width='126' ]");
	
	
}
