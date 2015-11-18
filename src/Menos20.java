
public class Menos20 extends acm.program.ConsoleProgram {
	
	public void run() {
		println(menos20(18));
		println(menos20(19));
		println(menos20(20));
	
	}
	
	private boolean menos20 (int n1) {
		
		
		if((n1 % 20) == 19||(n1 % 20) == 18){
			
				return true;
			
			}
			
			
		return false;
	}
		 

}
