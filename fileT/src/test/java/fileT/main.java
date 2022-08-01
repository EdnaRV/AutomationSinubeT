package fileT;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class main {
	public prin archivo; // objeto 
	//private String rutaArchivo = "C:\\Users\\envaldez\\Documents\\sinubeT\\data.txt";
	public String rutaArchivo = "C:\\Users\\envaldez\\Documents\\sinubeT\\fullData.csv";


public void leer (){

	ArrayList listOfElements = new ArrayList();
	try {
		archivo = new prin();
		listOfElements = archivo.Leerfile(rutaArchivo);
		//By monthFromFile = By.xpath("//*[contains(text(), '" + monthFile + " ')]  ");
		
		//Pattern patron = Pattern.compile("[a-z][A-Z]");
		
		
		
		for(int ie = 0; ie < listOfElements.size(); ie ++) {
			System.out.println("-"+ ie);
			
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
}
}
