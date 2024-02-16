package Objectrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginscreen {
	
	WebDriver driver;
	
	//creating a constructor
	public Loginscreen(WebDriver driver) {
		this.driver=driver;
	
		
	}

	
	By username = By.id("user-name");
	By password = By.id("password");
	By login    = By.id("login-button");
	
	public void giveusername(String user1) {
		driver.findElement(username).sendKeys(user1);
	}
	
	public void givepassword(String pw) {
		driver.findElement(password).sendKeys(pw);
	}
	
	public void clicklogin() {
		driver.findElement(login).click();
	}
	
	public void logindata(String user1,String pw) {
		this.giveusername(user1);
		this.givepassword(pw);
		this.clicklogin();
	}
}
