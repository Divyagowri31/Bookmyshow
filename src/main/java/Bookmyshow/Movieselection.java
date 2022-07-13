package Bookmyshow;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class Movieselection extends Base {

public Movieselection() {
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	@FindBy(id = "4")
	public WebElement Select;

	@FindBy(xpath = "//a[contains(text(),'Don (2022) (U)')]")
	public WebElement Movies;

	public void Select() {
		
		
		Common.clickFunction(Select, "Search icon");
	}

	public void Movie() {
		
		Common.getUrl();
		Common.clickFunction(Movies, "Don");
		
		//Common.getText(Movies, "Movie name");
	//	System.out.println("Movie Name  : " + Movies.getText());
	}
	
	
}
