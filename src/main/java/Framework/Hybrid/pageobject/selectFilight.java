package Framework.Hybrid.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectFilight {
	WebDriver driver;
	 selectFilight(WebDriver driver){
		 this.driver=driver;
	 }
	By outFlight=By.name("outFlight");
	By inFlight=By.name("outFlight");
	By reserveFlights=By.name("reserveFlights");
	
	
	
	public WebElement outflight(){
		return driver.findElement(outFlight);
		}
	public WebElement inFlight(){
		return driver.findElement(inFlight);
	}
	public WebElement reserveFlights(){
		return driver.findElement(reserveFlights);
	}
	public void closebrowser(){
		driver.quit();
	}
	
	
	
	
	
}
