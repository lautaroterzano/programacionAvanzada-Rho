package caber;

import java.io.IOException;
import java.util.List;


public class Main {

	public static void main(String[] args) throws IOException {
		
		List<Concursante> concursantes = Entrada.leerArchivo("entrada.txt");
//		System.out.println("MAIN");
//		for(Concursante c:concursantes) {
//			for(Lanzamiento l:c.getLanzamientos()) {
//				System.out.println("DISTANCIA "+ l.getDistancia() + " ANGULO "+l.getAngulo());
//			}
//		}
		Torneo ganadores = Torneo.iniciarTorneo(concursantes);
		
		Salida.escribirArchivo(ganadores, "ganadores.txt");
	}

}
