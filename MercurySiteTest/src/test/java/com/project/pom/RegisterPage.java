package com.project.pom;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BaseTest{
	
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
	By messageR = By.tagName("font");

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerUser() throws InterruptedException {
		click(registerLink);
		Thread.sleep(2000);
		if (isDisplayed(registerImg)) {
			sendKeysToElement("tester01", userC);
			sendKeysToElement("p4ss", passC);
			sendKeysToElement("p4ss", pass2C);
			click(enviar);
		}else {
			System.out.println("Register page not found");
		}
		
	}
	
	public String registeredMessage() {
		List<WebElement> fonts= findElements(messageR);
		return getText(fonts.get(5));
		
	}

}
