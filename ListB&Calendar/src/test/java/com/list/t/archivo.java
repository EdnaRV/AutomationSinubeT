package com.list.t;

import static org.testng.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.ss.formula.functions.CountUtils.I_MatchAreaPredicate;

import com.opencsv.CSVReader;

public class archivo {

	public void Leerfile(String ruta) throws IOException  {

		CSVReader reader = null;
		
		try {
			reader = new CSVReader(new FileReader(ruta),',');
			String[] nextLineStrings = null;
			
		} catch (Exception e) {
			
		}finally {
			if(null != reader) {
				reader.close();
			}
		}

		// :DDD
		

		}
	
}
