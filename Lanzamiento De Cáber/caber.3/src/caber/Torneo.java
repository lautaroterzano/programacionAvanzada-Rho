package caber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Torneo {
	List<Integer> ganadoresConsistencia;
	List<Integer> ganadoresDistancia;
	

	public static Torneo iniciarTorneo(List<Concursante> concursantes) { //Recibe la lista de concursantes y cada concursante tiene cargados sus lanzamientos
		Torneo ganadores = new Torneo();
		determinarGanadores(concursantes, ganadores); //Se van a determinar las distancias totales y consistencia de cada participante
		return ganadores;
	}
	
	private static void determinarGanadores(List<Concursante> concursantes, Torneo ganadores) {
		for(Concursante c : concursantes) {
			double distanciaTotal = 0;
			for(Lanzamiento l : c.getLanzamientos()) {
				distanciaTotal += c.getDistTotal() + l.getDistancia();
			}
			c.setDistTotal(distanciaTotal);
			//c.setConsistencia(c.calcularConsistencia(c.getLanzamientos()));//se le setea la consistencia a cada concursante
		}
		ganadores.setGanadoresDistancia(ganadorDistanciaTotal(concursantes));//se ordena las distancias
		//ganadores.setGanadoresConsistencia(ganadorConsistencia(concursantes));//seordenan las consistencias
	}

	private static List<Integer> ganadorDistanciaTotal(List<Concursante> concursantes) {
		List<Integer> ganadoresDistancia = new ArrayList<Integer>();
		Collections.sort(concursantes,new CompararConcursantes());
		
		for(Concursante c:concursantes) {
			ganadoresDistancia.add(c.getId());			
		}
		
		return ganadoresDistancia;
	}
	
	private static List<Integer> ganadorConsistencia(List<Concursante> concursantes) {
		List<Integer> ganadoresConsistencia = new ArrayList<Integer>();
		concursantes.sort(null);
		return ganadoresConsistencia;
	}
	
	public List<Integer> getGanadoresConsistencia() {
		return ganadoresConsistencia;
	}
	
	public void setGanadoresConsistencia(List<Integer> ganadoresConsistencia) {
		this.ganadoresConsistencia = ganadoresConsistencia;
	}
	
	public List<Integer> getGanadoresDistancia() {
		return ganadoresDistancia;
	}
	
	public void setGanadoresDistancia(List<Integer> ganadoresDistancia) {
		this.ganadoresDistancia = ganadoresDistancia;
	}

}
