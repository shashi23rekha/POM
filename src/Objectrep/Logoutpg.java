package Objectrep;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;

public class Logoutpg {
	WebDriver driver;
	
	
	public Logoutpg(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	By logout1 = By.id("logout_sidebar_link");
	
	
	public void lgoutpg() throws ElementNotInteractableException
	{
	driver.findElement(logout1).click();;
    }
	public void lop() {
		this.lgoutpg();
	}
	
	
}
