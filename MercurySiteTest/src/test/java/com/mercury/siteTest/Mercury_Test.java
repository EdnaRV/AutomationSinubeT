package com.mercury.siteTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;




import org.testng.annotations.Parameters;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;


public class Mercury_Test {
	
	private WebDriver driver;

	By registerLink = By.linkText("REGISTER");
	By registerImg = By.xpath("//img[@src='images/mast_register.gif']");
	By userC = By.id("email");
	By passC = By.name("password");
	By pass2C = By.name("confirmPassword");
	By enviar = By.name("submit");
	By ruserC = By.name("userName");
	By rpassC = By.name("password");
	By renviar = By.name("submit");
	By signIm = By.xpath("//img[@src='images/hdr_findflight.gif']");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver100.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
	}	
		
	

	@Test
	public void Registertest() throws InterruptedException {
		driver.findElement(registerLink).click();
		Thread.sleep(2000);
		if(driver.findElement(registerImg).isDisplayed()) {
			driver.findElement(userC).sendKeys("tester01");
			driver.findElement(passC).sendKeys("p4ss");
			driver.findElement(pass2C).sendKeys("p4ss");
			driver.findElement(enviar).click();
			
		}else {
			System.out.print("Register page isn´t avalible");
		}
		
		List<WebElement> fonts = driver.findElements(By.tagName("font"));

		assertTrue(" Note: Your user name is tester01.", fonts.get(5).isDisplayed());	
	}
	
	@Test
	public void signIn() throws InterruptedException {
	//	WebElement h3 = driver.findElement(By.(h3));

		if (driver.findElement(signIm).isDisplayed())
		{
			
			driver.findElement(ruserC).sendKeys("tester01");
			driver.findElement(rpassC).sendKeys("p4ss");
			driver.findElement(renviar).click();
			Thread.sleep(2000);
		//	assertTrue("Login Successfully", h3.isDisplayed() );
			
		}else {
			System.out.println("This isnt sign in page");
		}
		String logginS = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
		
		if(logginS.equals("Login Successfully")) {
			System.out.println("Login bienvenido");

		}
	}
	

}












