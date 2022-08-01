package com.browsers.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;


public class BrowsersTest {
	public WebDriver driver;
	

	By searchBox = By.name("q");
	By videoLocator = By.cssSelector("a[href=\"https://www.youtube.com/watch?v=6hiTvF2Eu0o\"]");
	  
	  @BeforeClass
	  
	  @Parameters({"URL", "BrowserType"})
	  
	  public void beforeClass(@Optional String URL, @Optional String BrowserType) {
		  
		  if (BrowserType.equalsIgnoreCase("Chrome")) {
			  System.setProperty("webdriver.chrome.driver", "./src/test/resources/resourses/chromedriver100.exe"); //:c
			  driver = new ChromeDriver();
			  
		}else if (BrowserType.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/resourses/geckodriver.exe");
			driver  = new FirefoxDriver();
			
		}else if (BrowserType.equalsIgnoreCase("Internet Explorer")) {
			System.setProperty("webdriver.ie.driver", "./src/test/resources/resourses/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			// https://www.msn.com/es-mx/?ocid=iehp
			//+ window
		}
		  
		  driver.manage().window().maximize();
		  driver.get(URL);
		  System.out.println("Opening:" + BrowserType);
	  }
	  	
		@Test 
		public void googleSearch() {

				WebElement searchbox = driver.findElement(searchBox);
				searchbox.clear();
				searchbox.sendKeys("i wanna be free");
				searchbox.submit();
				
				Duration timeS = Duration.ofSeconds(10);
				WebDriverWait wait = new WebDriverWait(driver, timeS);
				
	 			wait.until(ExpectedConditions.presenceOfElementLocated(videoLocator));
	 			
				assertTrue(driver.findElement(videoLocator).isDisplayed());
	 
		  }
	  
	  @AfterClass
	  public void afterClass() {
		 // driver.quit();
	  }

}
