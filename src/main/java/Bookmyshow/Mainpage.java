package Bookmyshow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Mainpage extends Base{

	public Mainpage() {

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	@FindBy(className = "sc-kaNhvL jlISnX ellipsis")
	public WebElement loc;

	@FindBy(xpath = "/ul[@class='sc-FQuPU eCIDPD']")
	public List<WebElement> listelementlocation;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/ul[1]")
	public WebElement values;

	@FindBy(xpath = "//div[@Class='sc-jKVCRD hmbjRr']//span")
	public WebElement dropdown;

	@FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")
	public WebElement innersearch;

	@FindBy(xpath = "//input[@type='text']")
	public static WebElement srh;

	@FindBy(id = "showDates")
	public static WebElement Dates;
	
	@FindBy(id="wzrk-cancel")
	public static WebElement popup;

	public void dropdwn() {
		driver.getCurrentUrl();
	System.out.println("Dropdown selected  :" + dropdown.isEnabled() );	
		Common.clickFunction(dropdown, "dropdwnchennai");
}

	public void innerSearch() {
		
		
		Common.clickFunction(innersearch, "Chennai");
		Common.isEnablemethod(innersearch, "Button is enabled");
		Assert.assertTrue(true, "Search button should be enabled");
	}

	public void citySearch() {
		
		Common.sendKeysMethod(innersearch, "Chennai");
	}

	public void citySearchClk() {
		
		
		Common.clickFunction(innersearch, "Chennai");
		System.out.println("City name : " + innersearch.getText());
		
	}
	
	public void popup() {
		
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//WebElement value=wait.until(ExpectedConditions.elementToBeClickable(By.id("wzrk-cancel")));
	 
			
			Common.clickFunction(popup, "Canceling the popup");
		
		

	}

}
