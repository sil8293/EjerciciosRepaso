 /*
	 * velocidad 60-0 el resultado es 0
	 * 61 y 80 el resultado es 1
	 * 81 o + el resultado es 2
	 *  y si es tu cumple aumenta 5+ftrddf
	 */

public class Multa extends acm.program.ConsoleProgram {
	
	public void run() {
		println(multaza(60,false));
		println(multaza(66,false));
		println(multaza(66,true));
	
	}
	
	private int multaza (int velocidad, boolean cumpleaños) {
		
		if(cumpleaños){
			velocidad = velocidad -5;
		}
		
		if(velocidad<=60){
			return 0;
		}
		if(velocidad>60 && velocidad<=80){
			return 1;
		}
		else
			return 2;
		
	
		
	}

}
