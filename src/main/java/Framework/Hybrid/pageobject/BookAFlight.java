package Framework.Hybrid.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookAFlight {
WebDriver driver;

BookAFlight(WebDriver driver){
	this.driver=driver;
	
}

By firstname=By.name("passFirst0");
By 	LastName=By.name("passFirst0");
By 	Meal=By.name("pass.0.meal");
By cardtype=By.name("creditCard");
By card_number=By.name("creditnumber");
By 	Expiration_month=By.name("cc_exp_dt_mn");
By Expiration_year=By.name("cc_exp_dt_yr");
By card_firstname=By.name("cc_frst_name");
By card_middlename=By.name("cc_mid_name");
By card_lastname=By.name("cc_last_name");
By Ticketless_Travel =By.name("ticketLess");
By bill_Address1=By.name("billAddress1");
By bill_Address2=By.name("billAddress2");
By bill_City=By.name("billCity");
By billState=By.name("billState");
By bill_Zip=By.name("billZip");
By bill_Country=By.name("billCountry");
By ticketLess=By.name("ticketLess");
By 	delAddress1=By.name("delAddress1");
By 	delAddress2=By.name("delAddress2");
By billCity=By.name("billCity");
By 	delState=By.name("delState");
By 	delZip=By.name("delZip");
By delCountry=By.name("delCountry");
By securePurchase=By.name("buyFlights");

public WebElement firstname(){
	return driver.findElement(firstname);
}
public WebElement lastname(){
	return driver.findElement(LastName);
}
public WebElement 	Meal(){
	return driver.findElement(	Meal);
}
public WebElement cardtype(){
	return driver.findElement(cardtype);
}
public WebElement card_number(){
	return driver.findElement(card_number);
}
public WebElement 	Expiration_month(){
	return driver.findElement(	Expiration_month);
}
public WebElement Expiration_year(){
	return driver.findElement(Expiration_year);
}
public WebElement card_firstname(){
	return driver.findElement(card_firstname);
}
public WebElement card_middlename(){
	return driver.findElement(card_middlename);
}
public WebElement card_lastname(){
	return driver.findElement(card_lastname);
}
public WebElement Ticketless_Travel(){
	return driver.findElement(Ticketless_Travel);
}
public WebElement bill_Address1(){
	return driver.findElement(bill_Address1);
}
public WebElement bill_Address2(){
	return driver.findElement(bill_Address2);
}
public WebElement bill_City(){
	return driver.findElement(bill_City);
}
public WebElement billState(){
	return driver.findElement(billState);
}
public WebElement bill_Zip(){
	return driver.findElement(bill_Zip);
}
public WebElement bill_Country(){
	return driver.findElement(bill_Country);
}
	public WebElement ticketLess (){
		return driver.findElement(ticketLess);
	}
	public WebElement delAddress1(){
		return driver.findElement(delAddress1);
	}
	public WebElement delAddress2(){
		return driver.findElement(delAddress2);
	}
	public WebElement billCity(){
		return driver.findElement(billCity);
	}
	public WebElement delState(){
		return driver.findElement(delState);
	}
	public WebElement delZip(){
		return driver.findElement(delZip);
	}
	public WebElement delCountry(){
		return driver.findElement(delCountry);
	}
	public WebElement securePurchase(){
		return driver.findElement(securePurchase);
	}
	public void closebrowser(){
		 driver.quit();
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



