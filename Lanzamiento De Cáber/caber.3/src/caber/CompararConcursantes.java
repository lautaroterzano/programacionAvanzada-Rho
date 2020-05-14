package caber;

import java.util.Comparator;

public class CompararConcursantes implements Comparator<Concursante>{
	
	@Override
	public int compare(Concursante o1, Concursante o2) {
		
		if(o1.getDistTotal()-o2.getDistTotal() < 0)
			return 1;
		if(o1.getDistTotal()-o2.getDistTotal() > 0)
			return -1;
					
		return 0;	

	}
}
