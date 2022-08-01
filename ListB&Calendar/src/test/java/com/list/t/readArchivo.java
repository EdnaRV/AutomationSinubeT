package com.list.t;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readArchivo {
	
	private WebDriver driver;
	private archivo archivo;
	private String rutaArchivo = "C:\\Users\\envaldez\\Documents\\sinubeT\\fullData.csv"; 
	private By cajaBusqueda = By.id("search_query_top"); 
	@Before
	public void setUp() throws Exception { 
		
		String rutaDriver = "./src/test/resources/drivers/chromedriver100.exe";
	System.setProperty("webdriver.chrome.driver", rutaDriver);
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	 @Test
	 public void test() {
		 
		 try {
			 archivo = new archivo();
				
				ArrayList lista = new ArrayList();

				lista = archivo.Leerfile(rutaArchivo);

				for (int i = 0; i < lista.size(); i++) {

				//driver.findElement(cajaBusqueda).clear();
				System.out.println("\n" + lista.get(i));
				
				}
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
	 }
	


}
