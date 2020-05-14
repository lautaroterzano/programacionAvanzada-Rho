package caber;

import java.util.Comparator;

public class CompararConcursantesConsistencia implements Comparator<Concursante> {

	@Override
	public int compare(Concursante o1, Concursante o2) {
		if(o1.getConsistencia() < 0) {
			return -1;
		}
		if(o1.getConsistencia() - o2.getConsistencia() > 0) {
			return 1;
		}
		if(o1.getConsistencia() - o2.getConsistencia() < 0) {
			return -1;
		}
		return 0;
	}
	
	

}
