package Objectrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productscreen {
	
	WebDriver driver;
	
	public Productscreen(WebDriver driver) 
	{
		this.driver = driver;
	
	}
	
	By BackPack1 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	By BikeLight1 = By.id("add-to-cart-sauce-labs-bike-light");
	By Jacket1    = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By Cart  = By.id("shopping_cart_container");
	By Checkout = By.id("checkout");
	
	
	By FirstName = By.id("first-name");
	By LastName = By.id("last-name");
	By ZipCode = By.id("postal-code");
	
	By Continue = By.id("continue");
	
	
	By Finish = By.id("finish");
	
	
	public void selectProduct1() {
		driver.findElement(BackPack1).click();
	}
		

	public void selectProduct2() {
		driver.findElement(BikeLight1).click();
	}
	

	public void selectProduct3() {
		driver.findElement(Jacket1).click();
	}
	
	
	public void ClickCart() {
		driver.findElement(Cart).click();
	}
	
	public void CheckOut() {
		driver.findElement(Checkout).click();
	}
	
	public void EnterInfor(String str1,String str2,String str3) {
		driver.findElement(FirstName).sendKeys(str1);
		driver.findElement(LastName).sendKeys(str2);
		driver.findElement(ZipCode).sendKeys(str3);
	}
	public void Continue() {
		driver.findElement(Continue).click();
	}
   public void Finish() {
	   driver.findElement(Finish).click();
   }
   
   public void ProductData(String str1,String str2,String str3) {
	   this.selectProduct1();
	   this.selectProduct2();
	   this.selectProduct3();
	   this.ClickCart();
	   this.CheckOut();
	   this.EnterInfor(str1, str2, str3);
	   this.Continue();
	   this.Finish();
	  
   }
}
