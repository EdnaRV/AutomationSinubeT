package com.list.t;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class writeArchivo {
	
	private static BufferedWriter bw;

	public static void main(String []args) {
		
		try {
			bw = new BufferedWriter(
					new FileWriter("C:\\Users\\envaldez\\Documents\\sinubeT\\data.txt")
			);
			bw.write("Hola, ya funciona :' ");
			
			
		}catch (Exception e) {
			// TODO: handle exception
			return;
		}
		
	}

}
