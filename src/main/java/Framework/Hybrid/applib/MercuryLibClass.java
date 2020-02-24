package Framework.Hybrid.applib;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Framework.Hybrid.common.*;
import Framework.Hybrid.pageobject.*;

public class MercuryLibClass extends BrowserDriver {

	private static HomePage objpage;
	private static WebDriver driver;

	public static void loginmercury(String userid, String pwd) {
		BrowserDriver bd = new BrowserDriver();
		// driver=BrowserDriver.ChromeBrowser();
		driver = bd.ChromeBrowser();
		objpage = new HomePage(driver);
		driver.get(Constant.URL);

		objpage.EmailID().sendKeys(userid);
		objpage.Paswword().sendKeys(pwd);
		objpage.SignIn().click();

	}

}
