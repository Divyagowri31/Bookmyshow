package Bookmyshow;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class Carddetails extends Base{

	public Carddetails() {
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	@FindBy(id="txtEmail")
	public static WebElement Mail;
	
	@FindBy(xpath="//div[@class='__pd-input-box _mobile-no']//input")
	public static WebElement Phonenumber;
	
	@FindBy(xpath = "//a[@data-auto='contact-details-continue']")
	public static WebElement Continue;
	
	@FindBy(id="txtCardNo")
	public static WebElement Cardnumber;
	
	@FindBy(id="txtCardName")
	public static WebElement Cardholdername;
	
	@FindBy(id="txtExpMonth")
	public static WebElement Month;
	
	@FindBy(id="txtExpYear")
	public static WebElement Year;
	
	@FindBy(id="txtCVV")
	public static WebElement CVV;
	
	public void mailId() {
		
		Common.sendKeysMethod(Mail, "divyaa311097@gmail.com");
	}
	
	public void phoneNumber() {
		Phonenumber.clear();
		Common.sendKeysMethod(Phonenumber, "9791094678");
	}
	public void clkContinue() {
		
		Common.clickFunction(Continue, "Continue Click");
	}
	
	public void cardNumber() {
		
		Common.sendKeysMethod(Cardnumber, "7894652178521234");
	}
	public void cardHolderName() {
		
		Common.sendKeysMethod(Cardholdername, "Gowri Elumalai");
	}
	
	public void expiryMonth() {
		
		Common.sendKeysMethod(Month, "12");
	}
	public void expiryYear() {
		
		Common.sendKeysMethod(Year, "22");
	}
	public void cvv() {
		
		Common.clickFunction(CVV, "Cvv fieldbox clicked");
	}
	public void cvv1() {
		
		Common.sendKeysMethod(CVV, "591");
	}
}
