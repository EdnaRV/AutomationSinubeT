package fileT;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class prin {

	public ArrayList Leerfile(String ruta) throws IOException{
		
		Scanner leer = new Scanner(System.in);
		ArrayList listOfWords = new ArrayList();
		
		BufferedReader bufferLector = new BufferedReader(new InputStreamReader(
		new FileInputStream(ruta),"utf-8"));
		
		String linea = "";
		
		while((linea = bufferLector.readLine()) != null) {
			listOfWords.add(linea);
		}
		
		bufferLector.close();
		return listOfWords;
	}
	
}
