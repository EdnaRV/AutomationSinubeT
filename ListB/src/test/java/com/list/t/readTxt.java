package com.list.t;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class readTxt {

	public ArrayList Leerfile(String ruta) throws IOException {

		Scanner leer = new Scanner(System.in);
		ArrayList lista = new ArrayList();

		BufferedReader buffer = new BufferedReader(new InputStreamReader(
		new FileInputStream(ruta), "utf-8"));

		String linea = "";

		while ((linea = buffer.readLine()) != null) {
		lista.add(linea);
		}

		buffer.close();
		return lista;
		}
	
}
