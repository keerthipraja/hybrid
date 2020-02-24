package Framework.Hybrid.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
	WebDriver driver;
	Register(WebDriver driver){
		this.driver=driver;
		
	}
By register=By.linkText("REGISTER");
By firstname=By.name("firstName");
By lastname=By.name("lastName");
By userName=By.name("userName");
By address1=By.name("address1");
By address2=By.name("address2");
By city=By.name("city");
By postalCode=By.name("postalCode");
By country=By.name("country");
By email=By.name("email");
By password=By.name("password");
By submit=By.name("register");

public WebElement  register (){
	return driver.findElement( register);
}

public WebElement firstname(){
	return driver.findElement(firstname);
}
	
	public WebElement lastname(){
		return driver.findElement(lastname);
	}
	public WebElement userName(){
		return driver.findElement(lastname);
}
	public WebElement address1 (){
		return driver.findElement(address1);
	}
	public WebElement adress2(){
		return driver.findElement(address2);
	}
	public WebElement city(){
		return driver.findElement(city);
	}
	
	public  WebElement postalCode(){
		return driver.findElement(postalCode);
	}
	
	
	
	
public Select Countryname() {
		
		Select drop = new Select(driver.findElement(country));
		// drop.selectByIndex(1);
		// drop.selectByIndex(2);
		// drop.selectByVisibleText("albania");
		return drop;

	}

	
	
	
	
	public  WebElement email(){
		return driver.findElement(email);
	}
	public  WebElement password(){
		return driver.findElement(password);
	}
	public  WebElement submit(){
		return driver.findElement(submit);
	}
	public void CloseBrowser() {
		
		driver.quit();
	}
	
}








