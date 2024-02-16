package Objectrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackHome {
	
WebDriver driver;
	
	//creating a constructor
	public BackHome(WebDriver driver) {
		this.driver=driver;
	
		
	}

	By BackHome = By.id("back-to-products");
	
	public void Home() {
		driver.findElement(BackHome).click();
	}
public void backHome()
   {
	this.Home();
   }
}
