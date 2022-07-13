package Bookmyshow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SeatSelection extends Base {

	public SeatSelection() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	@FindBy(xpath="//tbody/tr/td[2]//a[1]")
	public static List<WebElement> totalseatcount;
	
	@FindBy(xpath = "(//a[contains(text(),'AGS Cinemas: T. Nagar')])[1]")
	public static WebElement AgsTNgr;
	
	@FindBy(xpath = "(//div[@class='_available showtime-pill-container']//a)[8]")
	public static WebElement Time;

	@FindBy(id = "btnPopupAccept")
	public static WebElement Accept;

	@FindBy(id="A_6_04")
	public static WebElement Selectseats;
	
	@FindBy(xpath="//div[@class='btn-bar fnb-proceed-btn']//div")
	public static WebElement proceed;

	@FindBy(xpath = "(//ul[@id='popQty'])//li[1]")
	public static WebElement Countss;
	
	@FindBy(xpath="//div[@id='A_6_04']//a")
	public static WebElement Seatnumber;
	
	@FindBy(id="btmcntbook")
	public static WebElement Booking;
	
	@FindBy(xpath="//div[@id='proceed-Qty']")
	public static WebElement Proceed;
	
	@FindBy (xpath = "//tbody/tr/td[2]/div/a[1]")
    public static WebElement seatssss;
	
	public void theatre() {
		
	
		Common.clickFunction(AgsTNgr, "AGS-T.Nagar");
		Common.getText(AgsTNgr, "Print the theatre name");
				//System.out.println("Movie :" + AgsTNgr.g);
	}
	
	public void time() {
		
		Common.clickFunction(Time, "Time");
		System.out.println("Movie time :" +Time.getText());
	}
	
	public void accept() {
		
		Common.clickFunction(Accept, "Accept the condition");
	}
	
	public void seatNumber() {
		
		Common.clickFunction(Seatnumber, "Selecting the seat number");
	}
	public void selectSeats() throws InterruptedException {
		Thread.sleep(4000);
		/*if(Selectseats.isDisplayed()) {
			Selectseats.isEnabled();
			System.out.println("Select seat is enabled");
		}
		else {
			System.out.println("Not displayed");
		}
		System.out.println("Selectseats :" +Selectseats.isEnabled());*/
		Common.clickFunction(Selectseats, "Selecting the seat");
		
	}
	public void proceed() {
		WebDriverWait wait=new WebDriverWait(driver,10);
	WebElement value= wait.until(ExpectedConditions.elementToBeClickable(By.id("proceed-Qty")));
		
	value.click();
	}
	
	public void count() {
	
		Common.clickFunction(Countss, "Seat count");
		System.out.println("Single seat selected :" + Countss.getText());
	}
	
	
}

