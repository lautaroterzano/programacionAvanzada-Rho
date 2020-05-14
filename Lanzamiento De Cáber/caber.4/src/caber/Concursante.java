package caber;

import java.util.ArrayList;
import java.util.List;

public class Concursante {
	private List<Lanzamiento> lanzamientos = new ArrayList<Lanzamiento>();
	private double distTotal;
	private int id;
	private double consistencia;
	
	public double calcularConsistencia(List<Lanzamiento> lanzamientos) {//este metodo calcula la consistencia de cada competidor a partir de todos sus lanzamientos
		double consistencia = 0;
		double [] vector = new double[3];
		int i = 0;
		for(Lanzamiento l : lanzamientos) {
			vector[i++] = l.getAngulo();
			if(l.isFallido()) {
				consistencia = -1;
			}
		}
//		if(consistencia == 0) {
//			double ang1 = 0;
//			double angulo;
//			double diferencia;
//			int flag = 0;
//			for(Lanzamiento l : lanzamientos) {
//				if(flag == 0) {
//					ang1 = l.getAngulo();
//					flag = 1;
//				}else {
//					angulo = l.getAngulo();
//					diferencia = ang1 - angulo;
//					diferencia *= diferencia < 0? -1 : 1;
//					if(consistencia < diferencia) {
//						consistencia = diferencia;
//					}
//				}
//			}
//		}
		if(consistencia == 0) {			
			double diferencia12 = Math.abs(vector[0] - vector[1]);
			double diferencia13 = Math.abs(vector[0] - vector[2]);
			double diferencia23 = Math.abs(vector[1] - vector[2]);			
//			consistencia = diferencia12 > diferencia13 && diferencia12 > diferencia23 ? diferencia12 : 
//				diferencia13 > diferencia23 ? diferencia13 : diferencia23;
			consistencia = (diferencia12 + diferencia13 + diferencia23) / 3;
		}

		return consistencia;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(double consistencia) {
		this.consistencia = consistencia;
	}


	public List<Lanzamiento> getLanzamientos() {
		return lanzamientos;
	}

	public void setLanzamientos(ArrayList<Lanzamiento> lanzamientos) {
		this.lanzamientos = lanzamientos;
	}

	public double getDistTotal() {
		return distTotal;
	}
	
	public void setDistTotal(double distTotal) {
		this.distTotal = distTotal;
	}
	
	
}
