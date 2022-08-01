package com.list.t;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class listTest {
	
	private WebDriver driver;
	By passengersList = By.name("passCount");
	By departingList = By.name("fromPort");
	
	listPage list;

	@Before
	public void setUp() throws Exception {
		list = new listPage(driver);
		driver = list.chromeDriverConnection();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void listTestUwU() {
		list.visit("https://demo.guru99.com/test/newtours/reservation.php");
		
		Select selectPassenger = new Select(driver.findElement(passengersList));
		selectPassenger.selectByVisibleText(Integer.toString(1));
		
		//assertEquals(list.selectList1(), "4 ");
		
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[4]")).click();

		
		
		//list.selectList1();
	}

}
