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
	private readTxt archivo;
	private String rutaArchivo = "C:\\Users\\envaldez\\Downloads\\archivo.txt"; 
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

	System.out.println("** Empieza lectura de archivo **\n\n");
	ArrayList lista = new ArrayList();

	try {

	archivo = new readTxt();
	
	lista = archivo.Leerfile(rutaArchivo);

	for (int i = 0; i < lista.size(); i++) {

	driver.findElement(cajaBusqueda).clear();
	System.out.println("\n" + lista.get(i));
	driver.findElement(cajaBusqueda).sendKeys(lista.get(i).toString());
	driver.findElement(By.name("submit_search")).click();


	String text = driver.findElement(By.className("heading-counter")).getText();
	System.out.println(text);
	}

	} catch (IOException e) {
	e.printStackTrace();
	System.out.println("no se encontro el archivo");
	}
	}
	@After
	public void tearDown() throws Exception {
	System.out.println("\n\n\n* Se acaba la prueba ** ");
	//driver.quit();
	}


}
