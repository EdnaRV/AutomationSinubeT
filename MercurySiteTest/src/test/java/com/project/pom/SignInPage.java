package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BaseTest {
	
	By ruserC = By.name("userName");
	By rpassC = By.name("password");
	By renviar = By.name("submit");
	By signIm = By.xpath("//img[@src='images/hdr_findflight.gif']");
	
	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void singIn() {
		if (isDisplayed(ruserC)) {
			sendKeysToElement("tester01", ruserC);
			sendKeysToElement("p4ss", rpassC);
			click(renviar);
		}else {
			System.out.println("This isnt sign in page");

		}
	}
	
	public boolean inHome() {
		return isDisplayed(signIm);
	}
}
