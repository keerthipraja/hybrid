package Framework.Hybrid.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
@Test
public class HomePage {

	
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//driver.findelement(By.name("sasa")).sendkeys("sasa")
	By username = By.name("userName");
	By password = By.name("password");
	By loginbt = By.name("login");
	By Register = By.linkText("REGISTER");
	
	
	
	public WebElement EmailID() {
		return driver.findElement(username);
	}

	public WebElement Paswword() {
		return driver.findElement(password);
	}
	
	public WebElement SignIn() {
		// TODO Auto-generated method stub
		return driver.findElement(loginbt);
	}
	
	public WebElement RegisterLink() {
		// TODO Auto-generated method stub
		return driver.findElement(Register);
	}

	public void CloseBrowser() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
