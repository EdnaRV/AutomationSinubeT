package com.list.t;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.project.pom.BaseTest;

public class listPage extends BaseTest {
	private WebDriver driver;

	//1
	By passengersList = By.name("passCount");
	By departingList = By.name("fromPort");
	
	//2

	public listPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void selectList1() {
		
	//	WebElement listElements = findElement(passengersList);
	//	List<WebElement> options = listElements.findElements(By.tagName("option"));
		



		/*
		for (int i = 0; i < options.size(); i++) {
			if (getText(options.get(i)).equals("4 ")) {
				click(options.get(i));
				
			}
		}
		
		String selectedOption = "";
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).isSelected()) {
				selectedOption = getText(options.get(i));
			}
		}
		return selectedOption;
		*/
		
		
	}

}

