
public class Contesta extends acm.program.ConsoleProgram {
	
	
	public void run() {
		
		println(contesta(false,false,false));
		println(contesta(false,false,true));
		println(contesta(true,false,false));
	
	}
	
	private boolean contesta(boolean matinal, boolean madre, boolean dormido) {
		
			 if(!matinal && !madre && dormido){
				 return false;
			 }
			 if (matinal && !dormido){
				 return false;
			 }
			 
			  if (matinal && madre){
				  return true;
			  }
		return true;
		
		
	}

}
