package com.quality.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;

public class CrossBrowser {
	private WebDriver driver;
	By searchBoxBy = By.name("q");
	By videoLocator = By.cssSelector("a[href=\"https://www.youtube.com/watch?v=goaZTAzsLMk\"]");
	
	@Test 
  public void googleSearch() {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("testing videos");
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.presenceOfElementLocated(videoLocator));
		assertTrue(driver.findElement(videoLocator).isDisplayed());
  }
  @BeforeClass
  
  @Parameters({"URL", "BrowserType"})
  public void beforeClass(String url, String browserType) {
	  if (browserType.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		  driver = new ChromeDriver();
		  
	}else if (browserType.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/chromedriver/geckodriver.exe");
		driver = new FirefoxDriver();
		
	}else if (browserType.equalsIgnoreCase("Internet Explorer")) {
		System.setProperty("webdriver.ie.driver", "./src/test/resources/chromedriver/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	  
	  driver.manage().window().maximize();
	  driver.get(url);
	  System.out.println("Opening:" + browserType);
  }
}
