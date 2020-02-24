package Framework.Hybrid.TestScripts;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Framework.Hybrid.common.BrowserDriver;
import Framework.Hybrid.common.Constant;
import Framework.Hybrid.pageobject.HomePage;



public class HomePageTest extends BrowserDriver  {

	private HomePage hp;
	private WebDriver driver;
	
	 @BeforeMethod()
	 void LaunchBrowser()
	 {
		 
		 BrowserDriver bd = new BrowserDriver();
		 
		  //driver=BrowserDriver.ChromeBrowser();
		  driver=bd.ChromeBrowser();
		  hp=new HomePage(driver);
	 }

	
  @Test(dataProvider="getData")
  public void Login(String username,String password) throws IOException {
			  
	      driver.get(Constant.URL);
	  
		  boolean flagEmail=hp.EmailID().isEnabled();
		  Assert.assertTrue(flagEmail, "Validate PWD: PWD  is not display");		
		  Reporter.log("PWD Display sucessfully now enter the value in the field");	  
		  hp.EmailID().sendKeys(username);
		 
		  hp.Paswword().sendKeys(password);
		  hp.SignIn().click();
		  //hp.CloseBrowser();
	  
  }
  
  @AfterMethod
  public void CloseBrowser() throws InterruptedException
  {
	 // driver.quit();
	  Thread.sleep(2000);
	  hp.CloseBrowser();
  }
  
  @DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="sampleuser1";
	data[0][1] = "abcdef";

	// 2nd row
	data[1][0] ="testuser2";
	data[1][1] = "zxcvb";
	
	// 3rd row
	data[2][0] ="guestuser3";
	data[2][1] = "pass123";

	return data;
	}
  
  
  
}
