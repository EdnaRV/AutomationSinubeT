/*
package com.quality.testng;

import org.testng.annotations.Test;

//import com.google.common.io.Resources;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;


public class TestNGOne {
	WebDriver driver;
	By searchBoxLocator = By.id("search_query_top");
	By resultsLocator = By.cssSelector("span.heading-counter");
	
	  @Test
	  public void searchElement() {
		  WebElement searchbox = driver.findElement(searchBoxLocator);
		  searchbox.clear();
		  searchbox.sendKeys("Summer");
		  searchbox.submit();
		  
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.presenceOfElementLocated(resultsLocator));
		  
		  System.out.println("This is the result number:" + driver.findElement(resultsLocator).getText());
		  
		  assertTrue(driver.findElement(resultsLocator).isDisplayed(), "The is not result");
		  
		  
		  
	  }
		
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver100.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  
  }

  @SuppressWarnings("deprecation")
@AfterClass
  public void afterClass() {
	  //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 // driver.close();
  }

}
*/