package caber;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Salida {
	public static void escribirArchivo(Torneo ganadores, String ruta) {
		try {
			
			 File file = new File(ruta); 
			 
			 if (!file.exists()) {
			 file.createNewFile();
			 }
			 
			 BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			 
			 for(int i: ganadores.getGanadoresDistancia()) {
				 bw.write(String.valueOf(i));
				 bw.write(" ");
			 }
			 
			 bw.close();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }

	}
	}

