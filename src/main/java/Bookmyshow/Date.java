package Bookmyshow;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class Date extends Base {

	public Date() {

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	@FindBy(xpath = "(//div[@class=\"date-numeric\"])[3]")
	public static WebElement Dates;
	
	@FindBy(xpath="//body/div[5]/section[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/div[1]/div[1]/li/a[1]/div[2]")
	public static List<WebElement> Dates1;
	
	public void dateSelection() {
		
		//Common.clickFunction(Dates, "Dateselection");
		Common.list(Dates1, "24");
		//Common.list(Dates1, Url);
		
		//Common.getText(Dates, "Movie booking date");
	}
}
