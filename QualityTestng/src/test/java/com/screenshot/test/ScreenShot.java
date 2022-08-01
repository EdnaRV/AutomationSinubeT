/*Anotaciones cools
 * Date tiene un 0
 * Los métodos son los que se llaman
 * en maven se añade (y externo las librerias de apache FileUtils)
 * se andió un paquete para screen shoot
 * */

package com.screenshot.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver100.exe");
		driver = new ChromeDriver();
	}
	
	public String getDate() {
		Date date= new Date(0);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		return dateFormat.format(date);
	}
	
	@Rule
	public TestRule watcher = new TestWatcher() {
		@Override
		protected void failed(Throwable throwable, Description description) {
			File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils .copyFile(screenshotFile, new File("erro_" + description.getMethodName() + "_" + getDate() + ".png"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		protected void finished(Description description) {
			
			driver.quit();
		}
	};

	@Test
	public void test() {
		driver.get("https://google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("Pruebas automatizadas felices");
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		assertEquals("Error", driver.getTitle());
	}

}
