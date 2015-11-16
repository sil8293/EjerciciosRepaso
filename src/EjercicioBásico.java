/*
 * Es el ejercicio de las ardillas fiesteras
 * parámetro el numero de bellotas entre 40 y 60
 * fin de semana no hay limite
 */



public class EjercicioBásico extends acm.program.ConsoleProgram{
	public void run(){
		println(fiestaArdillas(30,false));
		println(fiestaArdillas(50,true));
		println(fiestaArdillas(70,true));
	}


	private boolean fiestaArdillas (int bellotas, boolean finDeSemana) {
		
		 if(bellotas>=40 && bellotas<=60 || finDeSemana){
			return true;

		}
		

		return false;
		
	}

	


}



