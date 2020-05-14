package caber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Entrada {

	private static BufferedReader br;

	public static List<Concursante> leerArchivo(String ruta) throws IOException {
		
		List<Concursante> listConcursantes = new ArrayList<Concursante>();

		try {
			
			br = new BufferedReader(new FileReader(new File(ruta)));
			int cant = Integer.valueOf(br.readLine());
			
			Concursante concursante = new Concursante();
			listConcursantes = new ArrayList<Concursante>(cant);
			
			for(int i = 0 ; i < cant ; i++) {//se leen los lanzamientos
				 concursante = new Concursante();
				for(int j = 0 ; j < 3 ; j++) {
					String []linea = br.readLine().split("\t");
					concursante.getLanzamientos().add(new Lanzamiento(Double.valueOf(linea[0]),Double.valueOf(linea[1])));
				}
				
				concursante.setId(i+1);
				listConcursantes.add(concursante);				
				}
			
			br.close();
			
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}finally {
			if(br != null) {
				br.close();
			}
		}
		return listConcursantes;
	}
}
