package Framework.Hybrid.common;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


//import org.apache.commons.;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDriver {

	WebDriver driver;

	public WebDriver FireFoxBrowser()

	{
		

		System.setProperty(
				"webdriver.gecko.driver",
				"C:\\Users\\npraj\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		this.driver = driver;
		return driver;
	}

	public WebDriver ChromeBrowser()

	{
		System.setProperty("webdriver.chrome.driver",
				"c:\\users\\npraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		this.driver = driver;
		return driver;
	}

	public WebDriver IEBrowser()

	{

		System.setProperty(
				"webdriver.ie.driver",
				"D:\\SeleniumTrainingSelf\\HyBridFramework\\BrowserDrivers\\IE\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		this.driver = driver;
		return driver;

	}

	/*
	 * public void getScreenshot(String result) throws IOException {
	 * 
	 * //driver=BrowserDriver.ChromeBrowser(); File
	 * src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(src, new
	 * File("C:/Personal/ScreenShots/"+result+System.
	 * currentTimeMillis()+"Screenshot.png"));
	 * 
	 * }
	 */

	public void getRobotScreenshot(String result) throws IOException,
			AWTException {

		Robot robot = new Robot();
		String format = "jpg";
		String fileName = "C:/Personal/ScreenShots/" + result
				+ System.currentTimeMillis() + "Screenshot." + format;

		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit()
				.getScreenSize());
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		ImageIO.write(screenFullImage, format, new File(fileName));

		System.out.println("A full screenshot saved!");

	}

	public void screenShot(String result) throws IOException {
		// using ITestResult.FAILURE is equals to result.getStatus then it enter
		// into if condition
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		ImageIO.write((RenderedImage) src, "jpg", new File(
				"C:/MySeleniumScreenShot/" + result + ".jpg"));

	}

}