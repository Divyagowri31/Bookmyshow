package Bookmyshow;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Common extends Base {

	public Common() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	
public static void sendKeysMethod(WebElement key,String Enter) {
	
  key.sendKeys(Enter);
System.out.println(Enter+" Value Entered ");
}

public static void clickFunction(WebElement element,String value) {
	   element.click();
	   System.out.println(value+" Button Clicked ");
}

public static  void getText(WebElement element, String get) {
	
	String text= element.getText();
	System.out.println("Text name: " + text);
	
}

public static  void list(List<WebElement>Dates1,String elementloc) 
{
	List <WebElement> list=Dates1;
	for(WebElement se:list)
	{
		String current= se.getText();
		if(current.equalsIgnoreCase(elementloc));
		
		se.click();
		System.out.println("Current element is clicked");
		break;
	}
}

public static void getUrl() {

	System.out.println(driver.getCurrentUrl());

}
/*public static void dateGiven(List<WebElement> totalseatcount,String specific,String specific2) {
	List<WebElement> Fromlist=totalseatcount;
	for(WebElement collect:Fromlist) {
		String current=collect.getText();
		if(current.equals(specific))
		{
			collect.click();
			System.out.println(specific + "is clicked");
			//break;
		}
		else if(current.equals(specific2))
		{
			collect.click();
			System.out.println(specific2 + "is clicked");
		}
		else {
			System.out.println("Seat not matched");
		}
	}*/
public static void isEnablemethod(WebElement element,String string)
{
	element.isDisplayed();
	
	//Assert.assertTrue(display);
}

}
