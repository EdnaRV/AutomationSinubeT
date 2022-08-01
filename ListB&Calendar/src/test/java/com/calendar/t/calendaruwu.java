package com.calendar.t;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendaruwu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\envaldez\\Documents\\ListB\\src\\test\\resources\\drivers\\chromedriver100.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/main/div[9]/span")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		Thread.sleep(5000);

		String flag = "False";

		while (flag == "False") {

			if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 15 2022')]"))
					.size() > 0) {

				driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 15 2022')]"))
						.click();
				Thread.sleep(5000);
				flag = "True";
				//change to 
				//validacion de existencia de fechas(antes de clicks) :D
				
			}

			else {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}

		}
		
		driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).click();
		Thread.sleep(5000);
		String flag2 = "False";
		while (flag2 == "False") {

			if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2022')]"))
					.size() > 0) {
				
				driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2022')]"))
						.click();
				Thread.sleep(5000);
				flag2 = "True";
				
			}

			else {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				//la flechita de siguiente sino lo encuentra en el mes actual :)
			}

		}
		
		System.out.println("Test case is passed :)");
		//driver.close();

	}

}
