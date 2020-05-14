package caber;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Salida {
	
	private static BufferedWriter bw;
	
	public static void escribirArchivo(Torneo ganadores, String ruta) {
		try {
			
			 File file = new File(ruta); 
			 
			 if (!file.exists()) {
			 file.createNewFile();
			 }
			 
			 bw = new BufferedWriter(new FileWriter(file));
			 
			 for(int i : ganadores.getGanadoresConsistencia()) {
				 bw.write(String.valueOf(i));
				 bw.write(" ");
			 }
			 bw.newLine();
			 
			 for(int i: ganadores.getGanadoresDistancia()) {
				 bw.write(String.valueOf(i));
				 bw.write(" ");
			 }
			 bw.newLine();
			 
			 
			 bw.close();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
				 if(bw != null) {
					 try {
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				 }
			 }

	}
	}

