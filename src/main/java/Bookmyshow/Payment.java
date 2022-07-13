package Bookmyshow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Payment extends Base {

	public Payment() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	@FindBy(xpath = "//div[@class='__seat-action btn-bar _centered _spaced']//a[1]")
	public static WebElement Payrupees;

	@FindBy(id = "//div[contains(text(),'More Payment options')]")
	public static WebElement paymentoption;

	@FindBy(xpath = "//div[@id='prePay']")
	public static WebElement pay;

	@FindBy(xpath = "//div[@class=\"btn-bar fnb-proceed-btn\"]//div")
	public static WebElement paypay;

	public void payRupees() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement value = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='__seat-action btn-bar _centered _spaced']//a[1]")));
		System.out.println("Payrupees is selected :" + Payrupees.isEnabled());
		Common.clickFunction(Payrupees, "Payment option is clicked :");
	}

	public void finalPay() {
	
		
		Common.clickFunction(paypay, "Final payment is clicked :");
		System.out.println("Pay button is selected :" + paypay.isEnabled());
	}
}
