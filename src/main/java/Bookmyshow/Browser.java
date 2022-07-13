package Bookmyshow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser extends Base {

	public Browser() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
public static void callBrowser(String browser) {
if(browser.equalsIgnoreCase("chrome"))	
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS );
	System.out.println("Chrome browser started");
}

else if(browser.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
}
else {
	System.out.println("Browser miss match");
}
}
public static void url(String browser, String link)
{
	callBrowser(browser);
	driver.get(link);
}
}
