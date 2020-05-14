package caber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrada {

	private static BufferedReader br;

	public static List<Concursante> leerArchivo(String ruta) throws IOException {
		Scanner lector;
		List<Concursante> listConcursantes = new ArrayList<Concursante>();

		try {
			lector = new Scanner(new File(ruta));
			
			br = new BufferedReader(new FileReader(new File(ruta)));
			listConcursantes = new ArrayList<Concursante>(lector.nextInt());
			Concursante concursante = new Concursante();
			int cant = Integer.valueOf(br.readLine());
			
			for(int i = 0;i < cant;i++) {//se leen los lanzamientos
				 concursante = new Concursante();
				for(int j = 0;j < cant;j++) {
					String []linea = br.readLine().split("\t");
					concursante.getLanzamientos().add(new Lanzamiento(Double.valueOf(linea[0]),Double.valueOf(linea[1])));
				}
				
				concursante.setId(i+1);
				listConcursantes.add(concursante);
				
				}
				
				
				
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return listConcursantes;
	}
}
