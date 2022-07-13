package bookmyshowrunner;

import Bookmyshow.Base;
import Bookmyshow.Browser;
import Bookmyshow.Carddetails;

import Bookmyshow.Date;
import Bookmyshow.Mainpage;
import Bookmyshow.Movieselection;
import Bookmyshow.Payment;
import Bookmyshow.SeatSelection;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Runner extends Base {
	
@BeforeTest
	public static void browserr() {
    new Browser();
	Browser.url(browser, Url);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);	
}
@Test(priority=1)
public static void mainPage() {
	
	new Mainpage().dropdwn();
	new Mainpage().innerSearch();
	new Mainpage().citySearch();
	//new MainPage().citySearchClk();
	new Mainpage().innersearch.sendKeys(Keys.ENTER);
	System.out.println("City selected");
	new Mainpage().popup();
}
@Test(priority=2)
	public static void movie()	{
	
	new Movieselection().Select();
	new Movieselection().Movie();

	System.out.println("Movie selected");
}
@Test(priority=3)
public static void dateBooking() {
	

	new Date().dateSelection();
	
	System.out.println("Date selected");
	}

@Test(priority=3)
public static void seatSelation() throws InterruptedException  {
	new SeatSelection().theatre();
	System.out.println("Theatre selected");
	new SeatSelection().time();
	new SeatSelection().accept();
	//
	Thread.sleep(5000);
	new SeatSelection().count();
	//new SeatSelation().seatNumber();
	Thread.sleep(8000);
	new SeatSelection().proceed();
	new SeatSelection().selectSeats();
	
	}

@Test(priority=5)
public static void pay() throws InterruptedException {
	Thread.sleep(4000);
	
	new Payment().payRupees();
	Thread.sleep(4000);
	new Payment().finalPay();
}


@Test(priority=6)
public static void carddetails() throws InterruptedException {
	
	Thread.sleep(6000);
	new Carddetails().mailId();
	new Carddetails().phoneNumber();
	new Carddetails().clkContinue();
	new Carddetails().cardNumber();
	new Carddetails().cardHolderName();
    new Carddetails().expiryMonth();
	new Carddetails().expiryYear();
	new Carddetails().cvv();
	new Carddetails().cvv1();
	
}


	}
	
	
	
	

