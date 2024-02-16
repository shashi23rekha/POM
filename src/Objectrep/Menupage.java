package Objectrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menupage {
	
WebDriver driver;
	
	//creating a constructor
	public Menupage(WebDriver driver) {
		this.driver=driver;
	
		
	}

	By menu = By.id("react-burger-menu-btn");
	
	
	
	
	public void menupg() {
		driver.findElement(menu).click();
	}
	
	public void menuclik() {
		this.menupg();
	}
	
}
