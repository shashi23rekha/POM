package Testcases;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objectrep.BackHome;
import Objectrep.Loginscreen;
import Objectrep.Logoutpg;
import Objectrep.Menupage;
import Objectrep.Productscreen;


public class saudeTestcases {
	
	
	public static WebDriver driver = null;
	
	
	@Test(priority=0)
	public void initialsteps() 
	{
	System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		
	//System.setProperty("webdriver.edge.driver","E:\\msedgedriver.exe");
		
	//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
	driver = new FirefoxDriver();
	//driver = new ChromeDriver();
	//driver = new EdgeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	}
	
	
	@Test(priority=1)
	public void login() {
		Loginscreen lgin = new Loginscreen(driver);
		lgin.logindata("standard_user","secret_sauce");
		
	}
	
	
	@Test(priority=4)
	public void menuclik() {
		Menupage mnpg = new Menupage(driver);
		mnpg.menupg();
		
	}
	
	@Test(priority=2)
	public void shop() throws NoSuchElementException
	{
	Productscreen prdscr = new Productscreen(driver);
	prdscr.ProductData("Shashi", "TK", "500005");
	
	sleep(3000);
	}
	
	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
	
	@Test(priority=3)
	public void bkhm() {
		BackHome bkhome = new BackHome(driver);
		bkhome.backHome();
	}


    @AfterTest
	public void logot(){
		Logoutpg lgot = new Logoutpg(driver);
		lgot.lop();
		
		
	}

	}

